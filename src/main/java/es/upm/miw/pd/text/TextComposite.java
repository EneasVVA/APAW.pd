package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextComposite extends Componente {
	List<Componente> componentes;

	public TextComposite() {
		super(true);
		componentes = new ArrayList<Componente>();
	}

	public void add(Componente componente) {
		componentes.add(componente);
	}

	@Override
	public String dibujar(boolean enMayus) {
		String componentesString = "";
		for (Componente componente : componentes) {
			componentesString += componente.dibujar(enMayus);
		}
		componentesString += fin();
		return componentesString;
	}

	@Override
	public void remove(Componente c) {
		componentes.remove(c);
	}

	protected abstract String fin();
}
