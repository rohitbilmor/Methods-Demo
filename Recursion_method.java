package com.methods;

public class Recursion_method {
	static void func(int x)
	{
		if(x>0)
		{
			System.out.println(x);
			func(x-1);
				//or
//			func(x-1);
//			System.out.println(x);
			
		}
	}
	public static void main(String[] args) {
		func(3);

	}

}
