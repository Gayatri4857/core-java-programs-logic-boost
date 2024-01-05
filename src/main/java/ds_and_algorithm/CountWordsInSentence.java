package ds_and_algorithm;

import java.util.Scanner;

public class CountWordsInSentence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Count Words :");
		String strWords = sc.nextLine();
		int i,totalWords;
		totalWords =1;
		char TWord_ch;
		
		for(i=0;i<strWords.length();i++)
		{
			TWord_ch=strWords.charAt(i);
			if((TWord_ch==' ')||TWord_ch=='\t') {
				totalWords++;
			}
		}
		System.out.println("Total Number of Words :"+totalWords);
	}

}
