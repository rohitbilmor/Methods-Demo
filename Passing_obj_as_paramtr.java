package com.methods;

public class Passing_obj_as_paramtr {
	static void update(int A[])
	{
		A[0]=25;
	}
	public static void main(String[] args) {
		int B[]= {2,3,4,5,6};
		update(B);
		System.out.println(B[0]);

	}

}
