package es.upm.miw.pd.text;

public class Parrafo extends TextComposite {
	@Override
	public void add(Componente c) {
		if (!c.esCompuesto())
			super.add(c);
		else
			throw new UnsupportedOperationException();
	}

	@Override
	public String dibujar(boolean enMayus) {
		return super.dibujar(enMayus);
	}

	@Override
	public void remove(Componente c) {
		if (!c.esCompuesto())
			super.remove(c);
	}

	@Override
	public String fin() {
		return "\n";
	}
}
