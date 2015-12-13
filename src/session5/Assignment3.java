package session5;

class Shape1{
	double length,width;
	Shape1(double side1,double side2)
	{
		length = side1;
		width = side2;
	}
    Shape1(double side)
    {
    	length = side;
    	width = side;
    }
    double area()
    { 
    	return length*width;
    }
}

public class Assignment3 {
	public static void main(String[] args) {
		
		Shape1 rectangle = new Shape1(5,6);
		System.out.println("Area of rectangle : "+rectangle.area());
		Shape1 square = new Shape1(5);
		System.out.println("Area of square : "+square.area());
	}

}
