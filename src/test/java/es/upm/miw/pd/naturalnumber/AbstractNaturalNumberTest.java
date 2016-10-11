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
	public void testSetValue() {
		creator = new NaturalNumberCreatorEs();
		AbstractNaturalNumber n = creator.createNaturalNumber(11);
		n.setValue(3);
		assertEquals("tres", n.getTextValue());	}

	@Test
	public void testAdd() {
		creator = new NaturalNumberCreatorEn();
		AbstractNaturalNumber n = creator.createNaturalNumber(0);
		n.add(2);
		assertEquals("two", n.getTextValue());
	}

}
