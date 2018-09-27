package es.upm.miw.iwvg.mastermind.models;

import es.upm.miw.iwvg.mastermind.utils.ClosedInterval;

import java.util.*;

public class TokensSequence {

    private ArrayList<Color> tokens;
    private static final int DIMENSION = 4;

    TokensSequence(){
        this.tokens = new ArrayList<Color>(DIMENSION);
    }

    public Color getColor(int position){
        assert (new ClosedInterval(0,DIMENSION-1).includes(position));
        return tokens.get(position);
    }

    public void setColor(int position, Color color){
        assert (new ClosedInterval(0,DIMENSION-1).includes(position));
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
}
