package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.GameLogic;
import es.upm.miw.iwvg.mastermind.models.Game;

public class LocalLogic implements GameLogic {

    private Game game;

    private LocalStartController startController;

    private LocalCheckTokensController checkTokensController;

    private LocalContinueController continueController;

    public LocalLogic(){
        this.game = new Game();
        startController = new LocalStartController(this.game);
        checkTokensController = new LocalCheckTokensController(this.game);
        continueController = new LocalContinueController(this.game);
    }

    public LocalOperationController getOperationController(){
        switch (game.getState()){
            case STARTING:
                return startController;
            case PLAYING:
                return checkTokensController;
            case FINISHED:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
