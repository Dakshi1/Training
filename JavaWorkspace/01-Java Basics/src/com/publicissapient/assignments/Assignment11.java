package com.publicissapient.assignments;

import java.util.Stack;

public class Assignment11 {

	public String reverseByWords(String sentence) { 
		
		StringBuilder s=new StringBuilder();
		Stack<Character> st=new Stack<Character>();
		int n=sentence.length();
		for(int i=n-1;i>=0;i--)
		{
			if(sentence.charAt(i)==' ')
			{
				StringBuilder dummy=new StringBuilder();
				while(st.empty()==false)
				{
					dummy.append(st.lastElement());
					st.pop();
				}
				dummy.append(' ');
				s.append(dummy);
			}
			else 
			{
				st.push(sentence.charAt(i));
			}
		}
		StringBuilder dummy=new StringBuilder();
		while(st.empty()==false)
		{
			dummy.append(st.lastElement());
			st.pop();
		}
		dummy.append(' ');
		s.append(dummy);
		return s.toString(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment11 a=new Assignment11();
		System.out.println(a.reverseByWords("my name is dakshi"));
	}

}
