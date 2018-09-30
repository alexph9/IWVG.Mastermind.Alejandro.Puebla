package es.upm.miw.iwvg.mastermind.models;

public class Attempt {
    private TokensSequence playerTokens;


    Attempt(){
        this.playerTokens = new TokensSequence();
    }

    private TokensSequence getBoardTokens(){ return this.playerTokens; }

    public void clear(){
        for(Color color : playerTokens.getTokens()){
            playerTokens.getTokens().clear();
        }
    }

    public void fillRandomColors(){
        this.playerTokens.chooseTokensRandom();
    }

    public void setPlayerTokens(TokensSequence playerTokens) {
        this.playerTokens = playerTokens;
    }
}
