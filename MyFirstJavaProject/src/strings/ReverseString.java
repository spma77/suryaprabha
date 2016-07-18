package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String original; //for storing user input
		String reverse=" "; //for storing reverse of string
		
		//now take input from the user
		System.out.println("enter string to reverse: ");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		
		int len=original.length();
		
		for(int i=len-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
		
		//lets print both the String objects
		System.out.println("original string is : "+original);
		System.out.println("reverse of string is : "+reverse);
		
		
		
	}

}
