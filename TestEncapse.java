package com.oopsInJava;

public class TestEncapse {
	public static void main(String[] args) {
		
		EncapsOne eo = new EncapsOne();
		
		eo.setId(1001);
		eo.setName("jashvika");
		
		int id = eo.getId();
		String name = eo.getName();
		
		System.out.println("Employee Name is :"+name);
		System.out.println("employe id is :"+id);
	
	}
	

}
