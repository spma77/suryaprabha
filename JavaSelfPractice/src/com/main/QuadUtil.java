package com.main;



public class QuadUtil {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		int a = r.area(5, 8);
		System.out.println(a);
		
		Square s = new Square();
		System.out.println(s.area(7));
		
		
		Append2Strings a2p = new Append2Strings();
		
		String concat = a2p.concatination( "ahu", "dnj");
		System.out.println(concat);
		
		String adp = a2p.concatination("jkiji", "nbjh", "nk");
		System.out.println(adp);
		
		System.out.println(a2p.concatination("Hello ", "Prabha!"));
			
		MathUtil mu = new MathUtil();
		Integer product = mu.multiply(5, 6);
		System.out.println(product);
		
		Integer val = mu.devide(20, 10);
		System.out.println(val);
		
	}
	
	
	
	
}
