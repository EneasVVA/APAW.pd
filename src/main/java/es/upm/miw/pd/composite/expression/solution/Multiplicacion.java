package es.upm.miw.pd.composite.expression.solution ;


public class Multiplicacion extends Operation {

	public Multiplicacion(Expresion izquierda, Expresion derecha) {
		super(izquierda, derecha);
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return expresion.get("izquierda").operar() * expresion.get("derecha").operar();
	}

	@Override
	char operation() {
		// TODO Auto-generated method stub
		return '*';
	}
	
	
}
