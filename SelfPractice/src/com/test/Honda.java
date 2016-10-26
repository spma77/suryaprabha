package com.test;

public class Honda extends Car{            //abstraction
	void run(){
		System.out.println("running safely");
	}
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
	}
	
	

}
