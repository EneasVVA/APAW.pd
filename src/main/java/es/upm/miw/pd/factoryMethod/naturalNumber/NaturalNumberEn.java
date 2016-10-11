package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends AbstractNaturalNumber {

    private static final String[] textValue = {"zero", "one", "two", "three", "for", "five"};

    
	public NaturalNumberEn(int value) {
		this.value = value;
	}

	@Override
	public String[] getTextValues() {
		return NaturalNumberEn.textValue;
	}

    

}
