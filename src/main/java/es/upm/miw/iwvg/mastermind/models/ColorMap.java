package es.upm.miw.iwvg.mastermind.models;

import java.util.Collections;
import java.util.Map;

public class ColorMap {

    private  Map<Color, String> ALL_COLORS;

    private static ColorMap colorMap;

    ColorMap(Map<Color, String> colors){
        this.ALL_COLORS = Collections.unmodifiableMap(colors);
    }

    public ColorMap getColorMap(){
        if(this.colorMap == null){
            this.colorMap = new ColorMap(this.createColorMap());
        }
        return this.colorMap;
    }

    private Map<Color, String> createColorMap(){
        Map<Color, String> color = null;
        color.put(Color.A, "Amarillo");
        color.put(Color.R, "Rojo");
        color.put(Color.V, "Verde");
        color.put(Color.Z, "Azul");
        color.put(Color.B, "Blanco");
        color.put(Color.N, "Negro");
        return color;
    }

    public Map<Color, String> getAllColors(){
        return ALL_COLORS;
    }
}
