package es.upm.miw.pd.text;

public class Caracter extends Componente {
	private char caracter;

	public Caracter(char valor) {
		super(false);
		this.caracter = valor;
	}

	@Override
	public String dibujar(boolean enMayus) {
		String caracterString = String.valueOf(caracter);
		if (enMayus) {
			caracterString = caracterString.toUpperCase();
		}
		return caracterString;
	}

	@Override
	public void add(Componente c) {
	}

	@Override
	public void remove(Componente c) {
	}
}
