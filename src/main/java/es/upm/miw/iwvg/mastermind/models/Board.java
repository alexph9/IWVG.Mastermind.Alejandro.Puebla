package es.upm.miw.iwvg.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class Board {

    private TokensSequence boardTokens;
    private TokensSequence secretTokens;
    private int dead;
    private int wounded;

    Board(){
        this.boardTokens = new TokensSequence();
        this.secretTokens = new TokensSequence(this.fillSecretTokens());
        this.dead = 0;
        this.wounded = 0;
    }

    public TokensSequence getBoardTokens(){ return this.boardTokens; }

    private void deadHandler(TokensSequence tokens, TokensSequence boardTokensCopy){

        for(int i = 0; i < boardTokensCopy.getTokens().size(); i++ ){
            if(boardTokensCopy.getTokens().get(i) == tokens.getColor(i)){
                this.dead+=1;
                boardTokensCopy.getTokens().set(i, null);
            }
        }
    }

    private void woundedHandler(TokensSequence tokens, TokensSequence boardTokensCopy){

        for(int i = 0; i < boardTokensCopy.getTokens().size(); i++ ){
            if(boardTokensCopy.isColorContained(tokens.getColor(i))){
                this.wounded+=1;
                boardTokensCopy.getTokens().set(tokens.posColorContained(getBoardTokens().getColor(i)), null);
            }
        }
    }

    private List<Color> fillSecretTokens(){
        List<Color> colorList = new ArrayList<Color>(this.boardTokens.getDimension());
        for(int i = 0; i < colorList.size(); i++){
            colorList.add(i, Color.X);
        }
        return colorList;
    }

    public boolean isVictory(TokensSequence sequence){
        return this.boardTokens.equalSequences(sequence);
    }

    public void calculateDeadAndWounded(TokensSequence tokens){
        try{
            TokensSequence tokensVisited = this.boardTokens.clone();
            this.deadHandler(tokens, tokensVisited);
            this.woundedHandler(tokens, tokensVisited);
        } catch(CloneNotSupportedException ex){}
    }

    public void clear(){ boardTokens.clearTokens(); }

    public void setBoardTokens(TokensSequence tokens){ this.boardTokens = tokens;}

    public void fillTokens(){ this.setBoardTokens(this.boardTokens.randomTokens()); }
}
