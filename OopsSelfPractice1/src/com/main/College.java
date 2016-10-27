package com.main;

public class College extends Univercity{       //methodOverRiding
	public static void main(String[] args) {
		College c = new College();
		c.read();
		c.write();
	}
	void read(){
		System.out.println("reading hard...");
	}
	
	

}
