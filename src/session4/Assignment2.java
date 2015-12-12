package session4;

import java.util.Arrays;
import java.util.Random;

public class Assignment2 {
	
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random rand = new Random();
		for(int i=0 ; i<6;i++)
		arr[i]=rand.nextInt(50) + 1;
		System.out.println("Printing original array : ");
		for(int i =0;i<6;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		Arrays.sort(arr);//sort the array
		System.out.println("Printing the sorted array : ");
		for(int i =0;i<6;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		
		arr[4] = 100;
		System.out.println("Printing modified array : ");
		for(int i =0;i<6;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		
	}

}
