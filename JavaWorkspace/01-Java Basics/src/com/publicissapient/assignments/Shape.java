package com.publicissapient.training.assignments;

public class Shape {

	private String color = "red";
	private boolean filled = true;

	public Shape() {
		super();
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "A Shape with color of " + getColor() + " and is " + (isFilled() ? "filled" : "Not filled");
	}

}
