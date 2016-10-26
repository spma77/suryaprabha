package com.test;

public class Splender extends Bike{             //methodoverRiding(child)
	public static void main(String[] args) {
		Splender s = new Splender();
		s.run();
		
	}
	void run(){
		System.out.println("running fine");
	}
}
