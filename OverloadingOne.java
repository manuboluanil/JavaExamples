package com.oopsInJava;

public class OverloadingOne {
	
	public void add (int a, int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	public void add (int a, int b,int d) {
	   int  c = a+b+d;
	   System.out.println(c);
	}
	public void add(int a,float b) {
		float c = a+b;
		System.out.println(c);
	}
	public void add (String a , String b) {
		String c = a+b;
		System.out.println(c);
	}
	

}
