package ds_and_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementAscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 
		System.out.print("Enter Number of elements in an array : ");
		int Size = sc.nextInt();	
		int [] a = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (int i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("\n Result :  ");
		for (int Number: a)
		{
			System.out.print(Number + "  ");
		}
	}
}


