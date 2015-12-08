package session2;

public class Assignment2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{   if(i==1)
			continue;
		    else if(i==2)
			      System.out.print(i+" ");
		else
		{   int flag = 0;
			for(int j=2;j<i;j++)
				if(i%j==0)
					{flag=1;break;}
			if(flag==1)
				continue;
			System.out.print(i+" ");
		}


		}
	}

}
