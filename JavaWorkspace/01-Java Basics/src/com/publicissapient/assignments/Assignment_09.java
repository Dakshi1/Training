package com.publicissapient.assignments;

import java.util.Arrays;

public class Assignment_09 {

	static String fin = "";

	static boolean isValidDate(int year, int month, int day) {
		if (year <= 0 || month <= 0 || day <= 0 || month > 12 || day > 31) {
			return false;
		}

		int[] month30 = { 4, 6, 9, 11 };

		if( month == 4 || month == 6 || month == 9 || month == 11) {
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

	public static void printCalendar(int month, int year) {
		if (month > 12 || month <= 0) {
			System.out.println("Wrong Input");
			return;
		}

		fin += "Su\tMo\tTu\tWe\tTh\tFr\tSa\n";

		int day1 = getDay(1, month, year);
		String thisRow = "";
		int cntt = 0;
		for (int j = 0; j < day1; j++) {
			thisRow += " \t";
			cntt++;
		}

		int dayCount = 1;
		boolean flag = false;
		while (true) {
			for (int cnt = cntt; cnt < 7; cnt++) {
				if (isValidDate(year, month, dayCount)) {
					thisRow += dayCount + "\t";
					dayCount++;
				} else {
					flag = true;
					break;
				}

			}
			thisRow += "\n";
			cntt = 0;
			if(flag) {
				break;
			}
		}
		fin+=thisRow;
		System.out.println(fin);

	}

	public static void main(String[] args) {
		printCalendar(1, 2019);
	}

}
