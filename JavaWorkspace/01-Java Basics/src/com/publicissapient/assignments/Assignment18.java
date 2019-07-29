package com.publicissapient.assignments;

import java.util.ArrayList;
import java.util.Scanner;

class ValidateInputs {

	static String x;
	static int intCount, nonIntCount;
	static String intInputs="", nonIntInputs="";
	static int sum;

	public static void main(String args[]) {

		takeInputs();
		print();
	}

	private static void takeInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want to give input");
		String s = sc.nextLine();

		while (!s.equalsIgnoreCase("NO")) {
			x = sc.nextLine();
			try {
				int i = Integer.parseInt(x);
				intInputs+=i+" ,";
				intCount++;
				sum += i;
			} catch (NumberFormatException e) {
				nonIntInputs+=x+" ,";
				nonIntCount++;
			}
			System.out.println("do you want to give input");
			s = sc.nextLine();
		}
		
	}

	private static void print() {
		int total= intCount+nonIntCount;
		System.out.println("Number of inputs = "+total);
		System.out.println("Number of integer inputs = "+intCount);
		System.out.println("Number of non-integer inputs = "+nonIntCount);
		System.out.println("Sum of all integer inputs = "+sum);
		System.out.println("The integer inputs = "+intInputs);
		System.out.println("The non-integer inputs = "+nonIntInputs);
		System.out.println(intCount+nonIntCount+" ,"+intCount+" ,"+ nonIntCount+" , etc should be actual values, based on the inputs.");
	}
}
