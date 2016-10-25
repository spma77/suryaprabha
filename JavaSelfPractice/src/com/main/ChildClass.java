package com.main;

public class ChildClass extends ParentClass {   //inheritance

	int interest = 1500;
	
	public static void main(String[] args) {
		ChildClass CC = new ChildClass();
		System.out.println("property is:" + CC.property);
		System.out.println("property is:" + CC.interest);
		System.out.println(property2);
		printProperty();
	}
	
	private void printProperty2() {
		System.out.println("Property is : " + property);
	}

}
