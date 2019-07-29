package com.publicissapient.assignments;

public class Assignment2 {

	public static boolean isValidDate(int year, int month, int day) { 
		// do stuff here
		// day, month , year cannot be negative
		if(year<=0 || month<=0 || day<=0)
			return false;
		if(month>12)
			return false;
		boolean leap_yr=false;
		if(year%400==0)leap_yr=true;
		else if(year%100!=0 && year%4==0)leap_yr=true;
		
		// cases to limit the number of days according to the month
		switch(month)
		{
			case 1:
				if(day>31)return false;
				break;
			case 2:
				if((leap_yr && day>29) || day>28)
					return false;
				break;
			case 3:
				if(day>31)return false;
				break;
			case 4:
				if(day>30)return false;
				break;
			case 5:
				if(day>31)return false;
				break;
			case 6:
				if(day>30)return false;
				break;
			case 7:
				if(day>31)return false;
				break;
			case 8:
				if(day>31)return false;
				break;
			case 9:
				if(day>30)return false;
				break;
			case 10:
				if(day>31)return false;
				break;
			case 11:
				if(day>30)return false;
				break;
			case 12:
				if(day>31)return false;
				break;
		}
		return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
