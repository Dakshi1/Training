package com.publicissapient.training.assignments;

public class Assignment_13 {
	public static void printAllCombinations(String word) {
		printString("", word);
		System.out.println();
	}
	
	private static String substring(String str, int st, int end) {
		if(end <= st) {
			return "";
		}
		else {
			return str.substring(st, end);
		}
		
	}

	private static void printString(String prev, String rem) {
		
		if(rem.length() == 1) {
			System.out.print(prev+rem + "\t");
			return;
		}
		
		for(int i=0;i<rem.length();i++) {
			printString(prev+rem.charAt(i), substring(rem, 0,  i)+substring(rem, i+1, rem.length()));
		}
		
	}
	
	public static void main(String[] args) {
		printAllCombinations("win");
		printAllCombinations("Shagun");
	}

}
