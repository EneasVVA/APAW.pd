package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {

	NaturalNumberManager numbersManager;

	NaturalNumberCreator creatorNumber;

	@Before
	public void setUp() {
		numbersManager = new NaturalNumberManager();
	}

	@Test
	public void testNaturalNumberEs() {
		creatorNumber = new NaturalNumberCreatorEs();
		numbersManager.setCreator(creatorNumber);
		numbersManager.createNaturalNumber(0);
		assertEquals(0, new NaturalNumberEs(0).getValue());
		assertEquals("cero", new NaturalNumberEs(0).getTextValue());
		numbersManager.createNaturalNumber(1);
		assertEquals(1, new NaturalNumberEs(1).getValue());
		assertEquals("uno", new NaturalNumberEs(1).getTextValue());
	}

	@Test
	public void testNaturalNumberEn() {
		creatorNumber = new NaturalNumberCreatorEn();
		numbersManager.setCreator(creatorNumber);
		numbersManager.createNaturalNumber(2);
		assertEquals(2, new NaturalNumberEn(2).getValue());
		assertEquals("two", new NaturalNumberEn(2).getTextValue());
		numbersManager.createNaturalNumber(3);
		assertEquals(3, new NaturalNumberEn(3).getValue());
		assertEquals("three", new NaturalNumberEn(3).getTextValue());
	}
}
