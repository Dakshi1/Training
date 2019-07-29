package com.publicissapient.training.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.publicissapient.training.programs.Person;

public class P12_SerializePersonData {

	static Person[]  personArray= {
			new Person("Dakshi", "Kanpur", "dakshi884@gmail.com"),
			new Person("Anant", "Bhopal", "antoo.g23@gmail.com")
	};
	
	public static void main(String[] args)  {
		
		
		try(FileOutputStream file = new FileOutputStream("people");
			ObjectOutputStream out = new ObjectOutputStream(file);
		){
			for(Person p: personArray) {
				out.writeObject(p);
			}
			System.out.println("Done!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
