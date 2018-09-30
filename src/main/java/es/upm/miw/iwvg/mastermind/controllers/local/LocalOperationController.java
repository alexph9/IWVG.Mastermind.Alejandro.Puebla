package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.iwvg.mastermind.models.Game;

public abstract class LocalOperationController extends LocalController
        implements OperationController {

    protected LocalOperationController(Game game){
        super(game);
    }

    public abstract void accept(OperationControllerVisitor operationControllerVisitor);
}
