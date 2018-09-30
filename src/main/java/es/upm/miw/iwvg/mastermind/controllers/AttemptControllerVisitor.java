package es.upm.miw.iwvg.mastermind.controllers;

public interface AttemptControllerVisitor {

    void visit(UserAttemptController userAttemptController);

    void visit(RandomAttemptController randomAttemptController);
}
