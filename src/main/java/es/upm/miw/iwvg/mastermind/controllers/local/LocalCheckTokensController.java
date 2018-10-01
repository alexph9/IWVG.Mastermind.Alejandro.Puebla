package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.controllers.CheckTokensController;
import es.upm.miw.iwvg.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.GameState;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;

public class LocalCheckTokensController extends LocalOperationController
            implements CheckTokensController {

    private Game game;

    LocalCheckTokensController(Game game){ super(game); }

    @Override
    public void buildAttempts(TokensSequence tokens){
        do{
            this.game.setPlayerTokens(tokens);
            this.checkToken(this.game.getPlayerTokens());
        }
        while(!super.isVictory(this.game.getPlayerTokens()) || super.hasMoreAttempts());
    }

    @Override
    public void checkToken(TokensSequence tokens){
        this.foundDeadOrWounded(tokens);
        if(!this.isVictory(tokens) || this.hasMoreAttempts()){
            this.restOneAttempt();
        } else {
            this.setState(GameState.FINISHED);
        }
    }



    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor){
        operationControllerVisitor.visit(this);
    }

}
