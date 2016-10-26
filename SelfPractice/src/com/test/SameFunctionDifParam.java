package com.test;

public class SameFunctionDifParam {       //methodOverLoading
	static int add(int a,int b){
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}
	static int add(int a, int b,int c){
		int sum = a + b + c;
		System.out.println(" Method overloading " + sum);
		return a+b+c;
		
	}
	

}
