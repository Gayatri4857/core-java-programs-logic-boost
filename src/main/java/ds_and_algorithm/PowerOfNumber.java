package ds_and_algorithm;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String args[]) {
		int number,power,result=1;
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		number= sc.nextInt();
		System.out.println("Enter Power :");
		power= sc.nextInt();
		
		for(int i=1;i<=power;i++)
		{
			result = number*result;
			
		}
		System.out.println("Power of Number is "+result);
			
		}
	
}

