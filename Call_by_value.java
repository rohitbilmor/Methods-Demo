package com.methods;

public class Call_by_value {
	static int method(int x)
	{
		x=x++;
		return x;
	}
	public static void main(String[] args) {
		int a=110;
		method(a);
		System.out.println(a);
		System.out.println("the actual parameter cannot be modified form formal parameters");
		
	
	}

}
