package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public interface CheckTokensController extends OperationController{

    void buildAttempts(TokensSequence tokens);
    void checkToken(TokensSequence tokens);
}
