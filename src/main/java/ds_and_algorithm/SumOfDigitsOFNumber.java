package ds_and_algorithm;

import java.util.Scanner;

public class SumOfDigitsOFNumber {
	public static void main(String args[]) {
		
		int number,digit,sum =0;
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum of Digits :"+sum);
	}

}
