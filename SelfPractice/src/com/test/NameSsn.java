package com.test;

public class NameSsn {       //encapsulation
	private String name;
	private String ssn;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSsn(){
		return ssn;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public static void main(String[] args) {
		NameSsn ns = new NameSsn();
		ns.setName("surya");
		ns.setSsn("27598475");
		System.out.println(ns.getName());
		System.out.println(ns.getSsn());
	}

}
