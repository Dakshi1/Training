package com.publicissapient.training.assignments;

public class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String colour) {
		super(radius, colour);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getRadius()*height;
	}

}
