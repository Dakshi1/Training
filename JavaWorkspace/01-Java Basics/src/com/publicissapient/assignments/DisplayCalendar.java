package com.publicissapient.assignments;
import java.util.Scanner;


class DisplayCalendar {

	// days[i] = number of days in month i
    static int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public static void main(String[] args) {
        int Y = 1998;    // year
        int M = 6;
        int startDayOfMonth = calc(M, Y);
        int spaces = startDayOfMonth;

        // months[i] = name of month i
        String[] months = {
                "",                               // leave empty so that we start with months[1] = "January"
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };

            

            // check for leap year
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)))
                days[2] = 29;
            

            


            // print calendar header
            // Display the month and year
            System.out.println("          "+ months[M] + " " + Y);

            // Display the lines
            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

            // spaces required
               spaces = (days[M-1] + spaces)%7;

            // print the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            

            //System.out.println();
        }
    }

	private static int calc(int m, int y) {
		
		if  ((((y % 4 == 0) && (y % 100 != 0)) ||  (y % 400 == 0)))
            days[2] = 29;
		int ans=0;
		int total_days=0;
		int leap_yrs=(y-1901)/4 - (y-1901)/100 + ((y-1)/400 - 4);
		total_days=(y-1)*365+leap_yrs;
		for(int i=1;i<m;i++)
			total_days+=days[i];
		return 0;
	}
}