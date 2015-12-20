package session6.assignment3;

public class TestClass {

	public static void main(String[] args) {
        Shapes tri = new Triangle();
        Shapes rect = new Rectangle();
        tri.draw(6,6);
        rect.draw(6,6);
        System.out.println("Area of triangle = "+tri.getArea());
        System.out.println("Area of rectangle = "+rect.getArea());
	}

}
