package es.upm.miw.iwvg.mastermind.models;

import com.sun.corba.se.impl.oa.toa.TOA;
import es.upm.miw.iwvg.mastermind.utils.ClosedInterval;

import java.util.*;

public class TokensSequence implements Cloneable{

    private List<Color> tokens;
    private static final int DIMENSION = 4;
    private static final ClosedInterval LIMITS = new ClosedInterval(0, DIMENSION-1);

    TokensSequence(){ this.tokens = new ArrayList<Color>(DIMENSION); }

    public Color getColor(int position){
        assert (LIMITS.includes(position));
        return tokens.get(position);
    }

    public int getDimension(){
        return DIMENSION;
    }

    public void setColor(int position, Color color){
        assert (LIMITS.includes(position));
        this.tokens.add(position, color);
    }

    public void chooseTokensRandom(){
        List<Color> colors = Collections.unmodifiableList(Arrays.asList(Color.values()));
        int size = colors.size();
        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < tokens.size(); i++){
            this.tokens.add(i, colors.get(random.nextInt(size)));
        }
    }

    public List<Color> getTokens(){ return this.tokens; }

    public boolean equalSequences(TokensSequence sequence){ return this.getTokens().equals(sequence.getTokens()); }

    public boolean isColorContained(Color color){ return this.getTokens().contains(color); }

    public int posColorContained(Color color){ return this.getTokens().indexOf(color); }

    public TokensSequence clone() throws CloneNotSupportedException{
        return (TokensSequence) super.clone();
    }
}
