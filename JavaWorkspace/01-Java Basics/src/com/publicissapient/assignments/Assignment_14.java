package com.publicissapient.training.assignments;

public class Assignment_14 {
	public static String generatePassword(int length) {
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = lower.toUpperCase();
		String nums = "1234567890";
		String spec = "~!@#$%^&*";
		String all = lower+upper+nums+spec;
		String pass = "";
		boolean flagl = false, flagu = false, flagn=false, flags=false;
		for(int i=0;i<length;i++) {
			int selThis = (int) (Math.random() * (all.length()));
			
			if(selThis < 26) { 
				flagl = true;
			}
			else if(selThis < 52) {
				flagu = true;
			}
			else if(selThis < 62) {
				flagn = true;
			}
			else {
				flags = true;
			}
			pass+=all.charAt(selThis);
		}
		if(!(flagu && flagl && flags && flagn)) {
			return generatePassword(length);
		}
		return pass;
	}

	public static void main(String[] args) {
		System.out.println(generatePassword(100));
		System.out.println("EOC");
	}
}
