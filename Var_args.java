//different ways to use variable arguments
package com.methods;

public class Var_args {
/*	static void show(int...s)
	{
		for(int i=0;i<s.length;i++)
		
			System.out.println(s[i]);
		}
	public static void main(String[] args) {
		int d[]= {1,2,3};
		show(d);
		show(new int[] {20,30,40});*/
	
	
	/* static void showList(String...s)
	{
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
	//String s[]={"robot","siri","alexa"};
	showList("robot","siri","alexa");*/
	
	static void showName(int x,String ... y)
	{
		for(int i=0;i<y.length;i++)
		{
			System.out.println(x+"."+y[i]);
			x++;
		}
	}
	public static void main(String args[])
	{
		showName(5,"robot","siri","alexa");
}
}