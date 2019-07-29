package com.publicissapient.assignments;

public class Assignment6 {

	public int fibonacci(int index) { 
		// do stuff here
		
		// index can't be negative
		if(index<0)return -1;
		if(index==0 || index==1)
			return index;
		int a=0, b=1, c=0;
		for(int i=2;i<=index;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c; 
	}
}
