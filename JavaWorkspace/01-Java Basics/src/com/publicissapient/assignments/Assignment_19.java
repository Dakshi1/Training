package com.publicissapient.training.assignments;

import java.util.Scanner;

public class Assignment_19 {
	static String fin = "";

	static boolean isValidDate(int year, int month, int day) {
		if (year <= 0 || month <= 0 || day <= 0 || month > 12 || day > 31) {
			return false;
		}

		int[] month30 = { 4, 6, 9, 11 };

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30)
				return false;
		} else if (month == 2) {
			if (year % 4 == 0 && day > 29)
				return false;
			if (year % 4 != 0 && day > 28)
				return false;
		}
		return true;
	}

	public static int getDay(int d, int m, int y) {
		d += m < 3 ? y-- : y - 2;
		int weekday = (23 * m / 9 + d + 4 + y / 4 - y / 100 + y / 400) % 7;
		return weekday;
	}

	public static int[][] getCalendar(int month, int year) {
		if (month > 12 || month <= 0) {
			System.out.println("Wrong Input");
			return null;
		}

		int[] firstRow = new int[7];
		
		int day1 = getDay(1, month, year);
		String thisRow = "";
		int cntt = 0;
		for (int j = 0; j < day1; j++) {
			firstRow[j] = 0;
			cntt++;
		}
		
		int[][] cal = new int[6][];
		
		int dayCount = 1;

		for (int cnt = cntt; cnt < 7; cnt++) {
			firstRow[cnt] = dayCount++;
		}
		int next = 0;
		cal[next++] = firstRow;
		
		boolean flag = false;
		while (true) {
			int[] row = new int[7];
			for (int cnt = 0; cnt < 7; cnt++) {
				
				if(flag) {
					row[cnt] = 0;
				}
				if (isValidDate(year, month, dayCount)) {
					row[cnt] = dayCount++;
				} else {
					flag = true;
				}

			}
			cal[next++] = row;
			row = new int[7];
			if (flag) {
				break;
			}
		}
		return cal;

	}
	
	public static void print(int[][] cal) {
		System.out.println("{");
		for(int i=0;i<cal.length;i++) {
			if(cal[i] == null) {
				break;
			}
			System.out.print(" {\t");
			for(int j=0;j<cal[i].length;j++) {
				System.out.print(cal[i][j]+ "\t");
			}
			System.out.println("},");
		}
		System.out.println("}");

	}

	public static void main(String[] args) {
		System.out.println("Enter the date (YYYY-MM)");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inp = input.split("-");
		int year = Integer.parseInt(inp[0]);
		int month = Integer.parseInt(inp[1]);
	
		print(getCalendar(month, year));
		

	}

}
