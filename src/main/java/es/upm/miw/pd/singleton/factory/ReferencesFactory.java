package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
	private Map<String, Integer> references;
	private Integer reference;
	static private ReferencesFactory instance = new ReferencesFactory();
	
	
	private ReferencesFactory() {
		super();
		references = new HashMap<>();
		reference = 0;
	}

	
	
	public int getReference(String key) {
		Integer result = this.references.get(key);
		if(result == null) {
				this.references.put(key, this.reference);
				result = this.reference;
				reference++;
		}
		return result;
	}
	
	public void removeReference(String key) {
		references.remove(key);
	}

	public static ReferencesFactory getFactory() {
		return instance;
	}
}
