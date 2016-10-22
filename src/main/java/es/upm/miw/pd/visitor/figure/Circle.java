package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure{
	private double radius;

	public Circle(float radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
    public int getSides(){
    	return 0;
    }
    
	@Override
    public void accept(AreaManager area) {
        area.visitCircle(this);
    }
    
	@Override
    public void accept(SidesManager sides) {
        sides.visitCircle(this);
    }
}
