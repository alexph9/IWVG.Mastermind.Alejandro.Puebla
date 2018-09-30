package es.upm.miw.iwvg.mastermind.controllers;


import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public interface TokenSequenceController{

    TokensSequence getPlayerTokens();

    void accept(TokensSequenceControllerVisitor tokensSequenceControllerVisitor);
}
