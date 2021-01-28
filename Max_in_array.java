package com.methods;

public class Max_in_array {
	static int max(int A[])
	{
		int max1=A[0];
		for(int i=0;i<=A.length-1;i++)
		{
		if(A[i]>max1)
		{
			max1=A[i];
		}
	}
		return max1;		
	}
	public static void main(String[] args) {
		int B[]= {1,22,4,7,13};
		System.out.println(max(B));

	}

}
