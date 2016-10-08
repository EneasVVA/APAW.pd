package es.upm.miw.pd.composite.expression.solution ;


public class Numero extends Expresion {
    public int valor;

    public Numero(int valor) {
    	this.valor = valor;
    }

	public void cambiar() {
    }

	@Override
	public boolean isOperation() {
		return false;
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public String toString() {
		return String.valueOf(valor);
	}
	
	

}
