package ds_and_algorithm;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The first number is :");
		int a =sc.nextInt();
		System.out.println("The second number is :");
		int b=sc.nextInt();
		
		System.out.println("Two numbers are:"+a+" and "+b);
		System.out.println("Fabonacci Series is as follows:");
		
		int c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
