package com.main;

public class Square extends Quad {
	

	public int area(int s) {

		return s * s;

	}

	@Override
	public int area(int l, int b) {
		// TODO Auto-generated method stub
		return l*b;
	}

}