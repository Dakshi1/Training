package com.publicissapient.training.assignments;

import java.util.Scanner;

public class Assignment_18 {

	long sum = 0;
	long ni = 0;
	long nni = 0;
	String intString = "";
	String nintString = "";
	Scanner s = new Scanner(System.in);
	
	public void getInput() {
		while (true) {
			System.out.print("Enter An Integer: ");
			String input = s.nextLine();
			try {
				int n = Integer.parseInt(input);
				ni++;
				intString += input + ", ";
				sum += n;
			} catch (NumberFormatException e) {
				nni++;
				nintString += input + ", ";
			} catch (Exception e) {
				System.out.println("Some Unknown Error");
			}

			System.out.print("Do you wish to continue: ");
			String cont = s.nextLine();
			if (cont.equals("NO"))
				break;
		}
	}

	public void printResult() {
		System.out.printf("Number of inputs = %d\n", (ni + nni));
		System.out.printf("Number of integer inputs = %d\n", ni);
		System.out.printf("Number of non-integer inputs = %d\n", nni);
		System.out.printf("Sum of all integer inputs = %d\n", sum);
		System.out.println("The integer inputs = " + intString);
		System.out.printf("The non integer inputs = " + nintString);
	}

	public static void main(String[] args) {
		Assignment_18 ass = new Assignment_18();
		ass.getInput();
		ass.printResult();
		ass.s.close();
	}

}
