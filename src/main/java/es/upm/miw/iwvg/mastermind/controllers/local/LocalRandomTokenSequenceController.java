package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.TokensSequenceControllerVisitor;
import es.upm.miw.iwvg.mastermind.controllers.RandomTokenSequenceController;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public class LocalRandomTokenSequenceController extends LocalTokenSequenceController
        implements RandomTokenSequenceController {

    protected LocalRandomTokenSequenceController(Game game){ super(game);}

    @Override
    public TokensSequence getPlayerTokens(){
        TokensSequence tokens= new TokensSequence();
        return tokens.randomTokens();
    }

    @Override
    public void accept(TokensSequenceControllerVisitor tokensSequenceControllerVisitor){
        tokensSequenceControllerVisitor.visit(this);
    }
}
