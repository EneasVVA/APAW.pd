package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs implements NaturalNumberCreator {

	@Override
	public AbstractNaturalNumber createNaturalNumber(int value) {
		// TODO Auto-generated method stub
		return new NaturalNumberEs(value); 

	}



}
