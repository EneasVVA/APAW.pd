package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEn implements NaturalNumberCreator {

	@Override
	public AbstractNaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEn(value); 
	}
	
	
	
}
