package fileoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuffReadEx {
	public static void buffEx() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bread = new BufferedReader(reader);
		System.out.println("Enter the first number: ");
		String s1 = bread.readLine();
		int num1 = Integer.parseInt(s1);
		System.out.println("Enter the second number: ");
		String s2 = bread.readLine();
		int num2 = Integer.parseInt(s2);
		int sub = num1 - num2;
		System.out.println("The substraction of 2 numbers is: " + sub);

	}
	public static void main(String[] args) throws IOException {
		BuffReadEx.buffEx();
	}
}