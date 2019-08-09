package com.publicissapient.training.assignments;

import java.util.concurrent.CyclicBarrier;

public class Assignment_15 {
	public static void main(String[] args) {
		Circle[] circles = { 
				new Cylinder(12.34), 
				new Cylinder(12.34, 10.0), 
				new Cylinder(12.34, 10.0, "blue") 
		};
		
		for(int i=0;i<circles.length;i++) {
			System.out.printf("Area: %f, Volume: %f\n", circles[i].getArea(), ((Cylinder)circles[i]).getVolume());
		}
	}
}
