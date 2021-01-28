package com.methods;

public class Max_using_varargs {
	static int max(int...x)
	{
		if(x.length==0) {
			return Integer.MIN_VALUE;}
			int maximum=x[0];
		for(int i=1;i<x.length;i++)
			if(x[i]>maximum)
			
				maximum=x[i];
			
		
		return maximum;
	}
		
	

	public static void main(String[] args) {
		System.out.println(max());
		System.out.println(max(12,24));
		System.out.println(max(12,24,36));
		System.out.println(max(12,24,67,98));

	}

}
