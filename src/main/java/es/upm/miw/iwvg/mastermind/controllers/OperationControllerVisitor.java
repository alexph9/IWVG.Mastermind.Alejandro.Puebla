package es.upm.miw.iwvg.mastermind.controllers;

public interface OperationControllerVisitor {

    void visit(StartController startController);

    void visit(AttemptController attemptController);

    void visit(ContinueController continueController);
}
