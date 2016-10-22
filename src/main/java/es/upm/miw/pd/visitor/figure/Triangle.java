package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure {
	private double base;

	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	public int getSides() {
		return 3;
	}

	@Override
	public void accept(AreaManager area) {
		area.visitTriangle(this);
	}

	@Override
	public void accept(SidesManager sides) {
		sides.visitTriangle(this);
	}
}
