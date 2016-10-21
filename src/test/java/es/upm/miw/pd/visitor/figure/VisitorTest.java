package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
	private List<Figure> figures;

	private FiguresManager manager;

	@Before
	public void setUp() {
		figures = new ArrayList<>();
		figures.add(new Circle(1));
		figures.add(new Circle(2));
		figures.add(new Square(3));
		figures.add(new Square(4));
		figures.add(new Triangle(5, 6));
		figures.add(new Triangle(7, 8));
		manager = new FiguresManager(figures);
	}

	@Test
	public void testTotalArea() {
		assertEquals(122.2831, manager.calculateArea(), 0.001);
	}

	@Test
	public void testTotalSides() {
		assertEquals(14, manager.calculateSides(), 0.001);
	}
}
