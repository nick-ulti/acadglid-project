package session4;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = sc.next();
		System.out.println("Your name is : "+name);
		System.out.print("Your name is reverse order is : ");
		for(int i = name.length() -1;i>=0;i--)
			System.out.print(name.charAt(i));
	}

}
