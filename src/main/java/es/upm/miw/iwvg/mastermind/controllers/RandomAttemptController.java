package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Attempt;

public interface RandomAttemptController extends AttemptController{

    Attempt getAttempt();
}
