package session7;

public class Assignment4 {

	public static void main(String[] args) {
		String str = "Hello";
		try{
		System.out.println("2nd character in string is : "+str.charAt(1));
		System.out.println("6th character in string is : "+str.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds Exception");
		}
	}

}
