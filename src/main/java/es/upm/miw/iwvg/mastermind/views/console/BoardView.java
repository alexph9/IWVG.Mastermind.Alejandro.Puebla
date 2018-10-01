package es.upm.miw.iwvg.mastermind.views.console;

import es.upm.miw.iwvg.mastermind.models.TokensSequence;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class BoardView {

    private PresenterController presenterController;

    BoardView(PresenterController presenterController){
        this.presenterController = presenterController;
    }

    void write(){
        IO io = new IO();
        for(int i = 0; i < TokensSequence.DIMENSION; i++){
            new ColorView(presenterController.getColor(new ))
        }
    }
}
