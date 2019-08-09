package com.publicissapient.training.assignments;

public class Assignment_17 {

	public static void main(String[] args) {
		Shape[] shapes = { 
				new Circle1(), 
				new Circle1(10), 
				new Circle1(10, "Blue", false), 
				new Rectangle(),
				new Rectangle(10, 20), 
				new Rectangle(10, 20, "Red", true), 
				new Square(), 
				new Square(10),
				new Square(10, "Green", true), 
				new Rectangle(20, 10)

		};

		for (int i = 0; i < shapes.length; i++) {

			if (shapes[i] instanceof Circle1) {
				System.out.printf("For %s\nPerimeter: %f, Area: %f\n",shapes[i].toString(), ((Circle1) shapes[i]).getPerimeter(),
						((Circle1) shapes[i]).getArea());
			} else if (shapes[i] instanceof Rectangle) {
				System.out.printf("For %s\nPerimeter: %f, Area: %f\n", shapes[i].toString(), ((Rectangle) shapes[i]).getPerimeter(),
						((Rectangle) shapes[i]).getArea());

			}

		}

	}
}
