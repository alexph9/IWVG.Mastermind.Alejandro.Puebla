package es.upm.miw.iwvg.mastermind.models;

import jdk.nashorn.internal.parser.Token;

import java.util.Map;

public class Game {

    private GameState state;

    private Board board;

    private TokensSequence player;

    private ColorMap colorName;

    private int numAttempts;

    private static final int MAX_NUM_ATTEMPTS = 10;

    public Game(){
        this.state = GameState.STARTING;
        this.board = new Board();
        this.player = new TokensSequence();
        this.colorName.getColorMap();
        this.numAttempts = this.MAX_NUM_ATTEMPTS;
    }

    public GameState getState(){
        return this.state;
    }

    public void setState(GameState state){
        this.state = state;
    }

    public void setPlayerTokens(TokensSequence player){ this.player.setTokens(player); }

    public TokensSequence randomTokens(){ return this.player.randomTokens();}

    public TokensSequence getPlayerTokens(){ return this.player; }

    public void clearPlayerTokens(){
        this.player.clearTokens();
    }

    public TokensSequence getBoardTokens(){
        return this.board.getBoardTokens();
    }

    public void setRandomBoardTokens(){
        this.board.fillTokens();
    }

    public void foundDeadOrWounded(TokensSequence playerTokens){
        this.board.calculateDeadAndWounded(playerTokens);
    }

    public void clearBoardTokens(){
        this.board.clear();
    }

    public boolean isVictory(TokensSequence playerTokens){
        return this.board.isVictory(playerTokens);
    }

    public Map<Color, String> getColorName() { return colorName.getAllColors(); }

    public int getNumAttempts(){ return this.numAttempts; }

    public void restOneAttempt(){ this.numAttempts -= 1;}

    public int getMaxNumAttempts(){ return this.MAX_NUM_ATTEMPTS; }

    public boolean hasMoreAttempts() { return this.getNumAttempts() != 0;}

    public void resetNumAttempts(){ this.numAttempts = this.getMaxNumAttempts();}
}
