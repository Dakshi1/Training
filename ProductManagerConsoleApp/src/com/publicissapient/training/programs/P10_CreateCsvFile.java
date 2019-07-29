package com.publicissapient.training.programs;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class P10_CreateCsvFile {

	public static void main(String[] args) throws Exception {
		
		FileWriter file=new FileWriter("friends.csv", true);
		
		// decorator for additional write functionalities
		
		PrintWriter out =new PrintWriter(file);
		//if(file.equals(""))
			out.println("SL No., Name, Email, City");
		
		int i=1;
		while(true)
		{
			String name=getStringFromKeyboard("Enter name");
			String email=getStringFromKeyboard("Enter email");
			String city=getStringFromKeyboard("Enter City ");
			
			out .printf("%d,\"%s\",\"%s\",\"%s\"\n", i++, name, email, city);
			
			String ans=getStringFromKeyboard("Continue? y/n");
			if(ans.equalsIgnoreCase("n"))
				break;
		}
		out.close();
		file.close();
	}
	static String getStringFromKeyboard(String message) throws Exception{
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return in.readLine();
	}
}
