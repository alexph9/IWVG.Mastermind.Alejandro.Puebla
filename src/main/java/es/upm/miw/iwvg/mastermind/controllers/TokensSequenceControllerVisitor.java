package es.upm.miw.iwvg.mastermind.controllers;

public interface TokensSequenceControllerVisitor {

    void visit(UserTokenSequenceController userAttemptController);

    void visit(RandomTokenSequenceController randomAttemptController);

}
