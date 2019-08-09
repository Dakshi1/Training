package com.publicissapient.training.assignments;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return super.getLength();
	}

	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);

	}

	public void setLength(double side) {
		setWidth(side);
	}

	@Override
	public String toString() {
		return "A Square with side=" + getSide() + ", which is subclass of " + super.toString();
	}
	
	

}
