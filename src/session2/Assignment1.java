package session2;

public class Assignment1 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if(age>=18)
			System.out.println("You are eligible for voting");
		else
			System.out.println("You are not eligible for voting");
	}

}
