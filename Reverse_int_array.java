package com.methods;
public class Reverse_int_array {
	static int[] reverse(int A[])
	{
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
			B[j]=A[i];
		return B;
	}	
	static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int C=12345;
		System.out.println(reverse(C));

	}

}
