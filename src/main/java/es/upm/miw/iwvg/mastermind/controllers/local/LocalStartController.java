package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.iwvg.mastermind.controllers.StartController;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.GameState;

public class LocalStartController extends LocalOperationController
        implements StartController {

    private Game game;

    LocalStartController(Game game){
        super(game);
    }

    public void start(){
        super.resetNumAttempts();
        super.setRandomBoardTokens();
        this.setState(GameState.PLAYING);
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor){
        operationControllerVisitor.visit(this);
    }

}
