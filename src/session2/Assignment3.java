package session2;

public class Assignment3 {
	
	public static void main(String[] args) {
		String temp[] = {"1","2","3","4","5"};
		for(int i=1;i<=10;i++)
		{   int k;
			if(i>5)
		    k = 10 -i;
		    else
			k=i;
			for(int j=1;j<=k;j++)
			{
				System.out.print(temp[j-1]);
			}
			System.out.println();
		}
	}

}
