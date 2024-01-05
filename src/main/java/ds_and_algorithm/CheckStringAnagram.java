package ds_and_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringAnagram {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first String :");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second String :");
		String str2 = sc.nextLine();
		
		str1 =str1.replace(" ", "".toLowerCase());
		str2 =str2.replace(" ", "".toLowerCase());
		
		char a[] =str1.toCharArray();
		char b[] =str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(a, b);
		
		if(result== true)
		{
			System.out.println("String are Anagram.");
		}
		else
		{
			System.out.println("String are not Anagram.");
		}
	}

}
