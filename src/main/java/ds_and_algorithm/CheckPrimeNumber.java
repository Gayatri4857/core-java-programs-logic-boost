package ds_and_algorithm;

import java.util.Scanner;

public class CheckPrimeNumber{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number =sc.nextInt();
		int i,count =0;
		
		for(i=2;i<=number/2;i++) {
			if(number%i ==0) {
				count++;
				break;
			}
		}
		if(count==0 && number!=1)
		{
			System.out.println(number+ " is Prime Number.");
		}
		else
		{
			System.out.println(number+ " is not Prime Number.");
		}
	}
	
}