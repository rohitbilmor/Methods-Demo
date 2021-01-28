package com.methods;

public class Sum_using_varargs {
	static int sum(int...x)
	{
		int s=0;
		for(int i=0;i<x.length;i++)
			s=s+x[i];
		return s;
	}
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(10));
		System.out.println(sum(10,23,565));

	}

}
