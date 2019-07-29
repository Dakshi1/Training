package com.publicissapient.assignments;

public class Assignment5 {

	public int sumOfPrimes(int from, int to) { 
		// do stuff here
		if(from<0 || to<0)return -1;
		int sum=0;
		if(from < 2)from=2;
		
		for(int i=from;i<=to;i++)
		{
			int lim=(int) Math.sqrt(i);
			boolean isPrime=true;
			//prime if divisible by number less than equal to its square-root
			for(int j=2;j<=lim;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				sum+=i;
		}
		return 0; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
