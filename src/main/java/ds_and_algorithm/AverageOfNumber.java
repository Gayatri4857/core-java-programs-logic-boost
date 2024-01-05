package ds_and_algorithm;

import java.util.Scanner;

public class AverageOfNumber {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter count of Number :");
		int count= sc.nextInt();
		int number,sum =0;
		float average=0;
		for(int i=0;i<count;i++)
		{
			System.out.println("Number :");
			number =sc.nextInt();
			sum =sum+number;
		}
		System.out.println("Sum of all Numbers are :"+sum);
		average = sum/count;
		System.out.println("Average of all Numbers are :"+average);
		
	}

}

