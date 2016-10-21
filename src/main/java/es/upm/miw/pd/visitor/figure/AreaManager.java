package es.upm.miw.pd.visitor.figure;

public class AreaManager implements Visitor{
	private double area;
	
	@Override
	public void visitCircle(Circle circle) {
		area += Math.PI + circle.getRadius() * circle.getRadius();
	}

	@Override
	public void visitSquare(Square square) {
		area += square.getSide() * square.getSide();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		area += triangle.getBase() * triangle.getHeight();		
	}

	public double getArea(){
		return area;
	}
}
