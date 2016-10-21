package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private Map<Character, Caracter> caracteres;

	private static FactoriaCaracter factoriaCaracter;

	private FactoriaCaracter() {
		caracteres = new HashMap<Character, Caracter>();
	}

	public static FactoriaCaracter getFactoria() {
		if (factoriaCaracter == null)
			factoriaCaracter = new FactoriaCaracter();

		return factoriaCaracter;
	}

	public Caracter get(char c) {
		if (caracteres.containsKey(c)) {
			return caracteres.get(c);
		} else {
			Caracter caracter = new Caracter(c);
			caracteres.put(c, caracter);
			return caracter;
		}
	}
}
