package com.oopsInJava;

public class TestHonda extends Bike {
	
	@Override
	public void show() {
         System.out.println("hello all");		
	}
public static void main(String[] args) {
		
		Bike b= new TestHonda();
		b.display();
		b.show();
	}
	
	
	
		
	}


