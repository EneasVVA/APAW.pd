package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs implements NaturalNumberCreator {

	@Override
	public AbstractNaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}

}
