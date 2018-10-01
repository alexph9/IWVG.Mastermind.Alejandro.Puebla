package es.upm.miw.iwvg.mastermind.controllers;

public interface OperationControllerVisitor {

    void visit(StartController startController);

    void visit(CheckTokensController checkTokensController);

    void visit(ContinueController continueController);
}
