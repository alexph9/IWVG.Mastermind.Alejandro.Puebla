package es.upm.miw.iwvg.mastermind.models;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public enum Error {
    INVALID_TOKEN("El conjunto de fichas es incorrecto"),
    EMPTY_TOKEN("La secuencia está vacía!");

    private String message;

    private Error(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return message;
    }
}
