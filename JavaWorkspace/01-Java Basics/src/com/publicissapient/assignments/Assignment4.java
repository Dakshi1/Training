package com.publicissapient.assignments;

import java.util.Arrays;

public class Assignment4 {

	public void sortThreeNumbers(int a, int b, int c) { 
		// do stuff here
		int arr[]=new int[3];
		arr[0]=a;arr[1]=b;arr[2]=c;
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
