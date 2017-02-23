package com.main;

public class verifyPrime {
	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {

			if (num % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {

			System.out.println("given no is prime ");
		} else

		{

			System.out.println("not a prime no");
		}
	}
}
