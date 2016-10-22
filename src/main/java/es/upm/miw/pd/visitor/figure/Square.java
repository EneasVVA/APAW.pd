package es.upm.miw.pd.visitor.figure;

public class Square implements Figure{
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	
	public int getSides() {
		return 4;
	}

	@Override
	public void accept(AreaManager area) {
		area.visitSquare(this);
	}

	@Override
	public void accept(SidesManager sides) {
		sides.visitSquare(this);
	}
}
