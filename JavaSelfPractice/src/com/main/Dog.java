package com.main;

public class Dog extends Animal{    //methodOverRiding
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
	}
	void eat(){
		System.out.println("eating something...");
	}

}
