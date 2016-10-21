package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private AbstractNaturalNumber naturalNumber;

	private NaturalNumberCreator creatorNumber;

	public void setCreator(NaturalNumberCreator creator) {
		this.creatorNumber = creator;
	}

	public void createNaturalNumber(int value) {
		this.naturalNumber = this.creatorNumber.createNaturalNumber(value);
	}

	public AbstractNaturalNumber getNaturalNumber() {
		return naturalNumber;
	}

}
