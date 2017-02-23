package com.main;

public class MultiplicationTable {
	public static void Multitable(){
		int num =5;
		int i;
		
		for(i=1;i<=num;i++){
			System.out.println(num+ "*" + i + "=" + (num*1));
			
		}
	}
	public static void main(String[] args) {
		MultiplicationTable.Multitable();
	}
}
