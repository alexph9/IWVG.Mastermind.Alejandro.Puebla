package es.upm.miw.iwvg.mastermind.views.console;

import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.TokensSequence;
import es.upm.miw.iwvg.mastermind.utils.IO;
import es.upm.miw.iwvg.mastermind.utils.LimitedIntDialog;
import jdk.nashorn.internal.parser.Token;

import java.util.ArrayList;
import java.util.List;

public class TokensSequenceView {

    private String title;

    private TokensSequence tokens;

    private IO io;

    TokensSequenceView(String title, TokensSequence tokens){
        this.title = title;
        this.tokens = tokens;
        io = new IO();
    }

    void read(){
        new IO().writeln(title);
        List<Color> tokensAux = new ArrayList<>(tokens.getDimension());
        String tokenPlayer = new IO().readString("[4 letras entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro]");
        tokenPlayer.toCharArray();
    }

}
