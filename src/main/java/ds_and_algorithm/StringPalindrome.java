package ds_and_algorithm;

import java.util.Scanner;

public class StringPalindrome {
	
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in) ;
			String str = scanner.nextLine();
			
			for (int i=0;i<str.length ()/2;i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("String is not palindrome.");
				return;
			}
		}
		System.out.println("String is Palindrome");
		}
	}


