package es.upm.miw.iwvg.mastermind.models;

import es.upm.miw.iwvg.mastermind.controllers.TokenSequenceController;
import es.upm.miw.iwvg.mastermind.utils.ClosedInterval;
import java.util.*;

public class TokensSequence implements Cloneable{

    private List<Color> tokens;
    public static final int DIMENSION = 4;
    private static final ClosedInterval LIMITS = new ClosedInterval(0, DIMENSION-1);

    public TokensSequence(){ this.tokens = new ArrayList<Color>(DIMENSION); }

    TokensSequence(List<Color> tokens){ this.tokens = tokens;}


    public Color getColor(int position){
        assert (LIMITS.includes(position));
        return tokens.get(position);
    }

    public int getDimension(){
        return DIMENSION;
    }

    public List<Color> getTokens(){ return this.tokens; }

    public void clearTokens(){
        for(Color color : this.getTokens()){
            this.getTokens().clear();
        }
    }

    public void setTokens(TokensSequence tokens) { this.tokens = tokens.getTokens(); }

    public TokensSequence randomTokens(){
        List<Color> colors = Collections.unmodifiableList(Arrays.asList(Color.values()));
        List<Color> randomTokens = new ArrayList<>(this.getDimension());
        int size = colors.size();
        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < randomTokens.size(); i++){
            randomTokens.add(i, colors.get(random.nextInt(size)));
        }

        return new TokensSequence(randomTokens);
    }

    public boolean equalSequences(TokensSequence sequence){ return this.getTokens().equals(sequence.getTokens()); }

    public boolean isColorContained(Color color){ return this.getTokens().contains(color); }

    public int posColorContained(Color color){ return this.getTokens().indexOf(color); }

    public TokensSequence clone() throws CloneNotSupportedException{
        return (TokensSequence) super.clone();
    }
}
