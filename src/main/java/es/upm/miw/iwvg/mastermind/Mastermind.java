package es.upm.miw.iwvg.mastermind;

import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.controllers.local.LocalLogic;
import es.upm.miw.iwvg.mastermind.views.console.ConsoleView;

public class Mastermind {

    private View view;

    private GameLogic gameLogic;

    public Mastermind(View view, GameLogic gameLogic){
        this.view = view;
        this.gameLogic = gameLogic;
    }


    public void play(){
        OperationController controller;
        do {
            controller = gameLogic.getOperationController();
            if(controller != null){
               view.interact(controller);
            }
        } while(controller != null);
    }

    public static void main(String[] args) {
        new Mastermind(new ConsoleView(), new LocalLogic()).play();
    }
}
