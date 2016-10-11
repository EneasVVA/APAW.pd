package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class AbstractNaturalNumber {

	protected int value;
	
	public AbstractNaturalNumber() {
		super();
	}
	
	public int getValue() {
	    return value;
	}
	
	public abstract String[] getTextValues();
	
    public String getTextValue() {
        return (this.value < getTextValues().length) 
        		? getTextValues()[this.value]
        		:"???";
       }

	public void setValue(int value) {
	    assert value >= 0;
	    this.value = value;
	}

	public void add(int value) {
	    this.setValue(this.value + value);
	}


}