package session6.assignment3;

public class Triangle implements Shapes {
	
	double height,base;

	@Override
	public void draw(double setBase, double setHeight) {
		height = setHeight;
		base = setBase;
	}

	@Override
	public double getArea() {
		return height*base/2;
	}
	

}
