package com.methods;

public class Is_prime_or_not {
	static boolean prime(int x)
	{
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
		return false;
			}

		}
		return true;
	}
	public static void main(String[] args) {	
		int a=99;
		
		
		//System.out.println(prime(a));
			//(or)
		if(prime(a))
			System.out.println(a+" is a prime");
		else
			System.out.println(a+" is not a prime");
		
	}

}
