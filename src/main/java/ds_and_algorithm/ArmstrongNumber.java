package ds_and_algorithm;

import java.util.Scanner;

public class ArmstrongNumber {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrongNumber(int num) {
	        if (num < 0) {
	            return false; // Negative numbers are not Armstrong numbers
	        }

	        int originalNumber = num;
	        int numberOfDigits = countDigits(num);
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        return sum == originalNumber;
	    }

	    // Function to count the number of digits in a number
	    public static int countDigits(int num) {
	        int count = 0;

	        while (num > 0) {
	            num /= 10;
	            count++;
	        }

	        return count;
	    }

}
