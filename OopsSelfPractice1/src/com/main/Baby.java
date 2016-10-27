package com.main;

public class Baby extends Child{        //Abstraction
	void run(){
		System.out.println("running safely");
	}
	public static void main(String[] args) {
		Baby b = new Baby();
		b.run();
	}

}
