package es.upm.miw.iwvg.mastermind.models;

import es.upm.miw.iwvg.mastermind.utils.ClosedInterval;

import java.util.ArrayList;
import java.util.List;

class Board {

    private TokensSequence boardTokens;
    private int dead;
    private int wounded;

    Board(){
        this.boardTokens = new TokensSequence();
        this.dead = 0;
        this.wounded = 0;
    }

    private TokensSequence getBoardTokens(){ return this.boardTokens; }

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

    public void clear(){
        for(Color color : boardTokens.getTokens()){
            boardTokens.getTokens().clear();
        }
    }

    public void fillTokens(){
        this.boardTokens.chooseTokensRandom();
    }
}
