package es.upm.miw.iwvg.mastermind.controllers.local;

import es.upm.miw.iwvg.mastermind.models.Game;

public class LocalAttemptControllerBuilder {

    private Game game;

    private LocalTokenSequenceController attemptController;

    LocalAttemptControllerBuilder(Game game){
        this.game = game;
    }

    void build(int gameOption){
        switch (gameOption){
            case 1:
                this.attemptController = new LocalUserTokenSequenceController(this.game);
            case 2:
                this.attemptController = new LocalRandomTokenSequenceController(this.game);
            default:
                this.attemptController =  new LocalRandomTokenSequenceController(this.game);
        }
    }

    LocalTokenSequenceController getAttemptController(){ return this.attemptController; }
}
