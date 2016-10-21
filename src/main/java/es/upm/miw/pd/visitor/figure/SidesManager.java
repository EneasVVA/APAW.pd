package es.upm.miw.pd.visitor.figure;

public class SidesManager implements Visitor{
	private int sides;
	
	@Override
	public void visitCircle(Circle circle) {
		sides += circle.getSides();
	}

	@Override
	public void visitSquare(Square square) {
		sides += square.getSides();
		
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		sides += triangle.getSides();
	}

	public int getSides(){
		return sides;
	}

}
