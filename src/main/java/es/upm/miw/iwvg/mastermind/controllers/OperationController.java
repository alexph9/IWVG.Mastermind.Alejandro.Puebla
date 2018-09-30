package es.upm.miw.iwvg.mastermind.controllers;

public interface OperationController {

    void accept(OperationControllerVisitor operationControllerVisitor);
}
