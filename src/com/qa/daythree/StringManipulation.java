package com.qa.daythree;

public class StringManipulation {
	
	// Create two strings where one string has a value of yesterday it was raining and the other string with a value of today it is sunny
	// Concatenate both value and print the output
	// result should be  Today it is sunny, yesterday it was raining. 

	public static void main(String[] args) {
			String yesterday = "yesterday it was raining";
			String today = "today it is sunny";
			String cat = yesterday +  ", " + today;
			System.out.println(cat);
			
			System.out.println((today.substring(0, 12) + yesterday.substring(17,24) ).toUpperCase());
			
			// implement 4 methods that manipulate string objects - for all parts you are only allowed to use length(), substring() and equals() methods.
			// Avoid using arrays or any methods you have yet to be taught.
			
			// 1 When given a string count and return how many words there are in the string
			
				String sentence = "This is the sentence to test";
				String sub = sentence.substring(0,4);
				System.out.println(sub);
			
			
			//2 When given a string print out this string in a vertical fashion each word on a different line
			
			// 3 Print the string in a vertical fashion in reverse order
			
			
			//4 A find method, which takes 2 strings a message and a string you want to find in the message. Should return a boolean. 
			System.out.println(sentence.contains("is")); // but shouldnt use this
	
	}

}
