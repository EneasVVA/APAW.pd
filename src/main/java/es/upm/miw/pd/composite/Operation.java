package es.upm.miw.pd.composite ;

import java.util.ArrayList;
import java.util.List;

public abstract class Operation extends Expresion {
    public List<Expresion> expresion = new ArrayList<Expresion> ();

    public Operation(Expresion izquierda, Expresion derecha) {
    }

}
