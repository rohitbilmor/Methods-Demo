package com.methods;

public class Gcd_of_2_nos {
	static int gcd(int x,int y)
	{
		while(x!=y)
		{
			if(x>y) 
				x=x-y;
			else
				y=y-x;
		}
		return x;
	}
	
	public static void main(String[] args) {
		int a=56,b=756;
		System.out.println(gcd(a,b));
	}

}
