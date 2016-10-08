package es.upm.miw.pd.composite.expression.solution ;


public class Resta extends Operation {

	public Resta(Expresion izquierda, Expresion derecha) {
		super(izquierda, derecha);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int operar() {
		return expresion.get("izquierda").operar() - expresion.get("derecha").operar();
	}

	@Override
	char operation() {
		// TODO Auto-generated method stub
		return '-';
	}
}
