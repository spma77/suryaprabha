package com.main;

public class Programmer extends Employee{   //Inheritance (chaild)
	int bonus = 10000;
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:"+p.salary);
		System.out.println("Programmer bonus is:"+p.bonus);
	}
	

}
