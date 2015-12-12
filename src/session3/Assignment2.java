package session3;

import java.util.Scanner;

public class Assignment2 {
	
	public boolean primeChecker(int num)
	{
		if(num==1)
			return false;
		else if(num==2)
			return true;
		else
		{
			int count=0;
			for(int i=2;i<num;i++)
				if(num%i==0)
					{count++;
					 if(count>0)
						 return false;
					}
				return true;
		}
	}
	
	public void printResult(boolean result)
	{
		if(result)
			System.out.println("The number is PRIME NUMBER");
		else
			System.out.println("The number is NOT PRIME NUMBER");	
		
		
		
	}

	     public static void main(String[] args) {
			Assignment2 objExample = new Assignment2();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an Integer : ");
			int num = sc.nextInt();
			objExample.printResult(objExample.primeChecker(num));
			
		}
}