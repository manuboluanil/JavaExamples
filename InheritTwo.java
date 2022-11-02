package com.oopsInJava;

public class InheritTwo extends InheritOne {
	
	public void mult (int a, int b ) {
		int c =a*b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		InheritTwo i = new InheritTwo();
		
	
		i.mult(10, 20);
		i.add(10, 50);
		
		
		
	}

}
