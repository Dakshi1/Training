package com.publicissapient.assignments;

public class Assignment8 {

	public double calculateSine(double x)
	{
		double ans=0;
		// calculation is done for 300 iterations
		int n=300;
		double sign=1;
		double num=x;
		double denom=1;
		for(int i=0;i<=n;i++)
		{
			ans=ans+ (num/denom)*sign;
			sign=sign*(-1);
			num=num*x*x;
			denom=denom*(2*(i+1))*(2*(i+1)+1);
		}
		return ans;
	}
	public static void main(String args[]) {
		Assignment8 x=new Assignment8();
		
		System.out.println(x.calculateSine(0));
		
		// converting degrees to radians 
		double d=30*0.0174533;
		System.out.println(x.calculateSine(d));
		d=45*0.0174533;
		System.out.println(x.calculateSine(d));
		d=60*0.0174533;
		System.out.println(x.calculateSine(d));
		d=90*0.0174533;
		System.out.println(x.calculateSine(d));
		d=180*0.0174533;
		System.out.println(x.calculateSine(d));
	}
}
