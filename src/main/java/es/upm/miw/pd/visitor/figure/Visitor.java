package es.upm.miw.pd.visitor.figure;

public interface Visitor {
	void visitCircle(Circle circle);

	void visitSquare(Square square);

	void visitTriangle(Triangle triangle);
}
