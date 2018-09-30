package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.TokensSequenceControllerVisitor;
import es.upm.miw.iwvg.mastermind.controllers.UserTokenSequenceController;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public class LocalUserTokenSequenceController extends LocalTokenSequenceController
        implements UserTokenSequenceController {

    protected LocalUserTokenSequenceController(Game game) {super(game);}

    @Override
    public TokensSequence getPlayerTokens(){
        return new TokensSequence();
    }

    @Override
    public void accept(TokensSequenceControllerVisitor tokensSequenceControllerVisitor){
        tokensSequenceControllerVisitor.visit(this);
    }
}
