package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.GameState;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

import java.util.Map;

public abstract class LocalController {

    private Game game;

    protected LocalController(Game game){
        assert game !=null;
        this.game = game;
    }

    protected GameState getState(){
        return game.getState();
    }

    public void setState(GameState state){
        assert state !=null;
        game.setState(state);
    }

    public void setPlayerTokens(TokensSequence player){ this.game.setPlayerTokens(player); }

    public void randomTokens(){ this.game.randomTokens();}

    protected TokensSequence getPlayerTokens(){ return this.game.getPlayerTokens(); }

    public void clearPlayerTokens(){ this.game.clearPlayerTokens(); }

    protected TokensSequence getBoardTokens(){ return this.game.getBoardTokens(); }

    public void setRandomBoardTokens(){ this.game.setRandomBoardTokens(); }

    public void foundDeadOrWounded(TokensSequence playerTokens){ this.game.foundDeadOrWounded(playerTokens); }

    public void clearBoardTokens(){ this.game.clearBoardTokens(); }

    public boolean isVictory(TokensSequence playerTokens){ return this.game.isVictory(playerTokens); }

    protected Map<Color, String> getColorName(){ return this.game.getColorName(); }

    protected int getNumAttempts(){ return game.getNumAttempts(); }

    public void restOneAttempt(){ game.restOneAttempt();}

    protected int getMaxNumAttempts(){ return this.game.getMaxNumAttempts();}

    public boolean hasMoreAttempts(){ return this.game.hasMoreAttempts(); }

    public void resetNumAttempts(){ this.game.resetNumAttempts();}

    public int getGameOption(){ return this.game.getOptionGame();}

    public void setGameOption(int optionGame){ this.game.setOptionGame(optionGame);}
}
