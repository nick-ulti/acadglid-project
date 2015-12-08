package session3;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num = sc.nextDouble();
		double srtval = Math.sqrt(num);
		double cubval = Math.cbrt(num);
		System.out.println("The square root of "+num+" : "+srtval+";and cube root : "+cubval);
		System.out.println();

	}

}
