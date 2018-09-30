package es.upm.miw.iwvg.mastermind.controllers;

public interface OperationControllerVisitor {

    void visit(StartController startController);

    void visit(ColocateTokensController colocateTokensController);

    void visit(ContinueController continueController);
}
