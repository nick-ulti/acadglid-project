package session7;

class MyException{
	int[] arr =new int[3];
	void method()
	{
		try{
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Occurs");
		}
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		MyException ex = new MyException();
		ex.method();
	}

}
