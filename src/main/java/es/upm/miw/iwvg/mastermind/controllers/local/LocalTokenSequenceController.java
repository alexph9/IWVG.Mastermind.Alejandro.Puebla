package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.TokenSequenceController;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

abstract class LocalTokenSequenceController extends LocalController
        implements TokenSequenceController {

    protected LocalTokenSequenceController(Game game){ super(game);}

    public abstract TokensSequence getPlayerTokens();
}
