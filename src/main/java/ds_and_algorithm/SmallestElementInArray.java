package ds_and_algorithm;

import java.util.Scanner;

public class SmallestElementInArray {
	public static void main(String args[])
	{
		int a[] = new int [10];
		int min;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Element :");
		for(int i=0;i<10;i++)
		{
				a[i]=sc.nextInt();
		}
		min=a[0];
	    for(int i=1;i<10;i++)
	  {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	    System.out.println("Smallest Element "+min);
	}
}

