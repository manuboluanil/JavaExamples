package com.oopsInJava;

public class InheritThree  extends InheritOne{
	
	public void div (int a , int b) {
		
		int v = a/b;
		System.out.println(v);
	}
	public static void main(String[] args) {
		InheritThree an = new InheritThree();
		an.add(60,40);
		an.div(10, 5);
		
	}

}
