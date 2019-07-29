package com.publicissapient.training.programs;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class P13_DeserializePersonData {

	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("people"));

		) {
			while (true) {
				try {
					Object obj = in.readObject();
					if (obj instanceof Person) {

						Person p=(Person) obj;
						System.out.println(p.getName());
					}
				} catch (EOFException e) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
