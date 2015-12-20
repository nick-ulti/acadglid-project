package session7;

class MyException2{
    void strtoNum(String str)
	{
		
			int num = Integer.parseInt(str);
			System.out.println("Number is "+num);
	
	
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		MyException2 ex1 = new MyException2();
		MyException2 ex2 = null;
		try{
		ex1.strtoNum("50");
		ex2.strtoNum("100");
		}
		catch(NullPointerException e){
			System.out.println("Null Ponter exception");
		}
	}

}
