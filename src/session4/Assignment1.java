package session4;

public class Assignment1 {
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i =0;i<5;i++)
			arr[i] = i +1;
		System.out.println("Printing array in original order : ");
		for(int i =0;i<5;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Printing array in reverse order : ");
		for(int i=0;i<5;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
	}

}
