package com.publicissapient.training.assignments;

public class Assignment_11 {
	public String reverseByWords(String sentence) {
		String str[] = sentence.split(" ");
		String fin = "";
		for(int i=str.length-1;i>=0;i--) {
			fin+= str[i]+  " ";
		}
		return fin;
	}
	
	public static void main(String[] args) {
		Assignment_11 obj = new Assignment_11();
		System.out.println(obj.reverseByWords("My name is Shagun"));
		System.out.println(obj.reverseByWords("Hello Mr Jon Doe... How are you feeling today"));
		System.out.println(obj.reverseByWords("Write a function called \"reverseByWords\", that takes a sentence (string) as an input, and returns another string"));
		System.out.println(obj.reverseByWords("The return value must be a sentence in which the words in the original sentence appear in reverse order"));
	}

}
