package com.test;

public class Programmer extends Employee{
	int Bonus =10000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Employee salary is:"+p.salary);
		System.out.println("employee salary is:"+p.Bonus);
		
	}
	

}
