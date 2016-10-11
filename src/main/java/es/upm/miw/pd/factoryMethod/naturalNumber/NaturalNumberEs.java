package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends AbstractNaturalNumber {

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
    	this.value = value;
    }
    
	@Override
	public String[] getTextValues() {
		return NaturalNumberEs.textValue;
	}

    

}
