package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.ContinueController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.GameState;

public class LocalContinueController extends LocalOperationController
        implements ContinueController {

    LocalContinueController(Game game){ super(game);}

    public void restart(boolean hasNewGames){
        if(hasNewGames){
            this.clearPlayerTokens();
            this.clearBoardTokens();
            this.resetNumAttempts();
            this.setState(GameState.STARTING);
        } else {
            this.setState(GameState.EXIT);
        }
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor){
        operationControllerVisitor.visit(this);
    }
}
