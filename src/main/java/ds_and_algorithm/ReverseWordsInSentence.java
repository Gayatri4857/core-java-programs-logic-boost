package ds_and_algorithm;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Original Sentence: ");
        String sentence =sc.nextLine();
        
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Sentence: " +reversedSentence);
    }

	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		
		StringBuilder reversed = new StringBuilder();
		
		for(int i=words.length -1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		return reversed.toString().trim();
	}
}
