package es.upm.miw.pd.memento.calculator;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {
	private Map<String, T> map;

	public MementoManager() {
		map = new HashMap<String, T>();
	}

	public void addMemento(String key, T memento) {
		map.put(key, memento);
	}

	public T getMemento(String key) {
		return map.get(key);
	}

	public String[] keys() {
		return map.keySet().toArray(new String[0]);
	}
}
