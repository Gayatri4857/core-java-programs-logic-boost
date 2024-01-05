package ds_and_algorithm;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String args[]) {

		System.out.println("Enter the Year :");
		Scanner sc =new Scanner(System.in);
		int year= sc.nextInt();
		
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("Year is Leap Year..");
		}
		else
		{
			System.out.println("Year is not Leap Year..");
		}
	}
	

}
