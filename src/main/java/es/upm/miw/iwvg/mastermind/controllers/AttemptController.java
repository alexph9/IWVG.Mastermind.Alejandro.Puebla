package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Attempt;

public interface AttemptController extends OperationController{

    Attempt getAttepmt();

    void accept(AttemptControllerVisitor attemptControllerVisitor);

}
