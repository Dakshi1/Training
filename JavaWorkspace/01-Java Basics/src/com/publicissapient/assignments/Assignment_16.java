package com.publicissapient.training.assignments;

public class Assignment_16 {
	
	public static void main(String[] args) {
		Person[] people = {
				new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
				new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0), 
				new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0), 
				new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
				new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
			};
		
		for(int i=0;i<people.length;i++) {
			System.out.println(people[i].toString());
		}

	}
	
}
