package com.methods;

public class Method_overloading {
	static int max(int x,int y) {
	return x>y?x:y;}
	static float max(float x,float y) {
	return x>y?x:y;}
	static int max(int x,int y,int z) {
	return x>y&&x>z?x:(y>z?y:z);}
	public static void main(String[] args) {
		int a=10,b=15;
		System.out.println(max(a,b));
		float c=10.5f,d=2.6f;
		System.out.println(max(c,d));
		int e=34,f=23,g=43;
		System.out.println(max(e,f,g));

	}

}
