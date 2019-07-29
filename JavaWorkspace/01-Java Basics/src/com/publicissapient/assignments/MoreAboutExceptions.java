package com.publicissapient.assignments;

import java.util.Scanner;

public class MoreAboutExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		
		try {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=x/y;
			
			System.out.println(z);
		} 
		finally {
			System.out.println("Unhandled exception found");
		}
		
		System.out.println("All Done");
		
	}

}
