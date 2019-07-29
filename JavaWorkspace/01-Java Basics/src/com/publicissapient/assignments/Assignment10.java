package com.publicissapient.assignments;

public class Assignment10 {

	public int[] sumOfEvensAndOdds(int []nums) { 
		// do stuff here
		int[] res=new int[2];
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			if(nums[i]%2==0)
				res[0]+=nums[i];
			else
				res[1]+=nums[i];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
