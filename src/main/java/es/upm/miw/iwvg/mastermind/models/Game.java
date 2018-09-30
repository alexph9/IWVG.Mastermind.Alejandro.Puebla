package es.upm.miw.iwvg.mastermind.models;

import java.util.Map;

public class Game {

    private GameState state;

    private Board board;

    private Attempt playerAttempt;

    private ColorMap colorName;

    public Game(){
        this.state = GameState.STARTING;
        this.board = new Board();
        this.playerAttempt = new Attempt();
        this.colorName.getColorMap();
    }

    public GameState getState(){
        return this.state;
    }

    public void setState(GameState state){
        this.state = state;
    }

    public void setPlayerTokens(TokensSequence player){
        this.playerAttempt.setPlayerTokens(player);
    }

    public TokensSequence getPlayerTokens(){
        return this.playerAttempt.getPlayerTokens();
    }

    public void setRandomPlayerTokens(){
        this.playerAttempt.fillRandomColors();
    }

    public void clearPlayerTokens(){
        this.playerAttempt.clear();
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

    public Map<Color, String> getColorName() {
        return colorName.getAllColors();
    }
}
