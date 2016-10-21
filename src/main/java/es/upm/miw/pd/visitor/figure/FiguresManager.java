package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {
	private List<Figure> figures;

	public FiguresManager(List<Figure> figures) {
		this.figures = new ArrayList<>();
		
		for(Figure f : figures)
			this.figures.add(f);
	}

	public double calculateArea() {
		AreaManager area = new AreaManager();
		
		for (Figure elemento : figures) {
			elemento.accept(area);
		}
		return area.getArea();
	}
	
	public double calculateSides() {
		SidesManager sides = new SidesManager();
		
		for (Figure elemento : figures) {
			elemento.accept(sides);
		}
		return sides.getSides();
	}
}
