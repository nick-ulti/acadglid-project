package session3;

import java.util.Scanner;

class Calculator
{
	double num1,num2;
	char moperator='#';
	void setValue(String str)
	{
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			if('0'<=str.charAt(i)&&'9'>=str.charAt(i))
			{   if(moperator=='#')
				num1 = num1*10 + str.charAt(i)-'0';
			   else
				num2 = num2*10 + str.charAt(i)-'0';  
			}
			else if(str.charAt(i)==32)
			continue;
			else
				moperator = str.charAt(i);
		}
		calValue();
	}
	void calValue()
	{   switch(moperator){
		case '+':
			System.out.println("=\n"+(num1+num2));
			break;
		case '-':
			System.out.println("=\n"+(num1-num2));
			break;
		case '*':
			System.out.println("=\n"+(num1*num2));
			break;
		case '/':
			System.out.println("=\n"+(num1/num2));
			break;
		case '%':
			System.out.println("=\n"+((int)(num1%num2)));
			break;
	    }
			
	}
		
	
}

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression : \n");
		String str = sc.nextLine();
		Calculator m_calc = new Calculator();
		m_calc.setValue(str);
		

	}

}
