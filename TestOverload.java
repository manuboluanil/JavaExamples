package com.oopsInJava;

public class TestOverload extends OverloadingOne{
	public static void main(String[] args) {
		
		OverloadingOne ol = new OverloadingOne();
		ol.add(10, 5f);
		ol.add(10, 50);
		ol.add("abc", "def");
		ol.add(10, 20, 30);
		
		
	}

}
