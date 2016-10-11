package es.upm.miw.pd.naturalnumber;

import static org.junit.Assert.*;

import javax.print.attribute.standard.NumberUpSupported;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.factoryMethod.naturalNumber.AbstractNaturalNumber;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreatorEs;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreatorEn;

public class AbstractNaturalNumberTest {
	NaturalNumberCreator creator;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAbstractNaturalNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testNaturalNumbersEs() {
		creator = new NaturalNumberCreatorEs();
		for(int i=0; i < 8; i++) {
			AbstractNaturalNumber n = creator.createNaturalNumber(i);
			switch(i) {
				case 0: assertEquals("cero", n.getTextValue()); break;
				case 1: assertEquals("uno", n.getTextValue()); break;
				case 2: assertEquals("dos", n.getTextValue()); break;
				case Integer.MAX_VALUE: assertEquals("???", n.getTextValue()); break;

			}
		}
	}
	
	@Test
	public void testNaturalNumbersEn() {
		creator = new NaturalNumberCreatorEn();
		for(int i=0; i < 8; i++) {
			AbstractNaturalNumber n = creator.createNaturalNumber(i);
			switch(i) {
				case 0: assertEquals("zero", n.getTextValue()); break;
				case 1: assertEquals("one", n.getTextValue()); break;
				case 2: assertEquals("two", n.getTextValue()); break;
				case Integer.MAX_VALUE: assertEquals("???", n.getTextValue()); break;

			}
		}
	}
	@Test
	public void testGetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTextValues() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTextValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

}
