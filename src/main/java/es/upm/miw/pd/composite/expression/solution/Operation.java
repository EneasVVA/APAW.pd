package es.upm.miw.pd.composite.expression.solution ;

import java.util.HashMap;
import java.util.Map;

public abstract class Operation extends Expresion {
    public Map<String, Expresion> expresion = new HashMap<> ();

    public Operation(Expresion izquierda, Expresion derecha) {
    	expresion.put("izquierda", izquierda);
    	expresion.put("derecha", derecha);
    }

    abstract char operation();
	@Override
	public boolean isOperation() {
		return true;
	}

	@Override
	public String toString() {
		return String.format("(%s%c%s)", expresion.get("izquierda").toString(), operation(), expresion.get("derecha").toString());
	}

    
    

}
