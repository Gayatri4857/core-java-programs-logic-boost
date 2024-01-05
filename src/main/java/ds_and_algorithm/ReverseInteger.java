package ds_and_algorithm;

import java.util.Scanner;

public class ReverseInteger {
	
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			String value = scanner.nextLine();
			System.out.println("Value:"+value);
			System.out.println("Enter a reverse Integer Value:");
			StringBuilder ref=new StringBuilder(value);
			
			System.out.println(ref.reverse());
		}
	}


