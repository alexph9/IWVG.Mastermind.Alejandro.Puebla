package es.upm.miw.iwvg.mastermind;

import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {
    public void interact(OperationController operationController);
}
