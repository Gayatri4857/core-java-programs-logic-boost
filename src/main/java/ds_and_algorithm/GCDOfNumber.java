package ds_and_algorithm;

import java.util.Scanner;

public class GCDOfNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr first number :");
		int a =sc.nextInt();
		System.out.println("Enter the second number :");
		int b= sc.nextInt();
		
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			c=i;
			
		}
		System.out.println("GCD = "+c);
	}

}
