package session6.assignment3;

public class Rectangle implements Shapes{
	double length,width;

	@Override
	public void draw(double setBase, double setHeight) {
		this.length = setBase;
		this.width = setHeight;
	}

	@Override
	public double getArea() {
		return length*width;
	}
	

}
