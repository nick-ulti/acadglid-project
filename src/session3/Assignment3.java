package session3;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int N = sc.nextInt();
		Random rand = new Random();
		int num = rand.nextInt(N);
		System.out.println("The random number : "+num);
	}

}

