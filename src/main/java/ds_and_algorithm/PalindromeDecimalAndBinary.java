package ds_and_algorithm;

import java.util.Scanner;

public class PalindromeDecimalAndBinary {
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int number = sc.nextInt();
			
			if(isPalindromeDecimal(number) && isPalindromeBinary(number)) {
				System.out.println(number + " is a palindrome in both decimal and binary");
			}
			else {
				System.out.println(number + " is not a palindrome in both decimal and binary");
			}
			
		}
		public static boolean isPalindromeDecimal(int number) {
			
			int originalNumber = number;
			int reverseNumber = 0;
			while(number > 0) {	
				int rem = number % 10;	
				reverseNumber = reverseNumber * 10 + rem;	
				number = number/10;
				}
				return originalNumber == reverseNumber;
			}
			public static boolean isPalindromeBinary(int number) {
				String binary = Integer.toBinaryString(number);
				int left = 0;
				int right = binary.length()-1;
				
				while(left < right) {
					if(binary.charAt(left) != binary.charAt(right)){
						return false;
					}
					left++;
					right--;
				}
				return true;
			}
	
}
