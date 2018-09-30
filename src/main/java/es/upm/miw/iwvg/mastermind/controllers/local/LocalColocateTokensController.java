package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.ColocateTokensController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.GameState;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public class LocalColocateTokensController extends LocalOperationController
            implements ColocateTokensController {

    private Game game;

    LocalColocateTokensController(Game game){ super(game); }

    @Override
    public void colocateToken(TokensSequence tokens){
        this.foundDeadOrWounded(tokens);
        if(!this.isVictory(tokens) || this.hasMoreAttempts()){
            this.restOneAttempt();
        } else {
            this.setState(GameState.FINISHED);
        }
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor){
        operationControllerVisitor.visit(this);
    }

}
