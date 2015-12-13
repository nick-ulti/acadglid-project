package session5;

class Shape{
	double base;
	double height;
	Shape(double val1,double val2)
	{
		this.base = val1;
		this.height = val2;
	}
	double area()
	{
		return 1;
	}
}
class Rectangle extends Shape{
	Rectangle(double a , double b)
	{
		super(a,b);
	}
	double area()
	{
		return base*height;
	}
}
class Triangle extends Shape{
	Triangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		return base*height/2;
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		
		Shape rect = new Rectangle(10,10);
		System.out.println("Area of Rectangle is : "+rect.area());
		Shape tri = new Triangle(10,10);
		System.out.println("Area of Triangle is : "+tri.area());
	
		
	}

}
