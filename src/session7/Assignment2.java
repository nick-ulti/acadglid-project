package session7;

class MyException1{
	int strtoNum(String str)
	{
		try{
			int num = Integer.parseInt(str);
			return num;
		}
		catch(NumberFormatException e){
			System.out.println("Number Format Exception Occurs");
			return 0;
		}
	
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		MyException1 ex1 = new MyException1();
		MyException1 ex2 = new MyException1();
		System.out.println(ex1.strtoNum("5"));
		System.out.println(ex2.strtoNum("Ad"));
	}

}
