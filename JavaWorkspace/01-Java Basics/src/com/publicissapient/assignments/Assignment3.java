package com.publicissapient.assignments;

public class Assignment3 {

	static boolean isPrimeNumber(int num) { 
		// do stuff here
		int lim=(int) Math.sqrt(num);
		
		// prime if divisible by number less than equal to its square-root
		for(int i=2;i<=lim;i++)
		{
			if(num%i==0)
				return false;
		}
		return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
