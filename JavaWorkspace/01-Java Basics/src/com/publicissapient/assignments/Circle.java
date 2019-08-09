package com.publicissapient.training.assignments;

public class Circle {
	private double radius = 1.0;
	private String colour = "red";
	
	public Circle() {
	}

	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
		colour = "red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circles [radius=" + radius + ", colour=" + colour + "]";
	}
	
}
