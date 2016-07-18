package loops;

import java.util.Scanner;


public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter something!");
		int n = in.nextInt();
		System.out.println("n is: " + n);
		int tempN = n;
		int temp = 0;
		int amstrong = 0;
		while (tempN != 0) {
			temp = tempN % 10;
			System.out.println("temp is " + temp);
			tempN = tempN / 10;
			System.out.println("tempN is " + tempN);
			amstrong = amstrong + temp * temp * temp;
			System.out.println("Inside the loop, amstrong is " + amstrong);
		}
		System.out.println("amstrong is " + amstrong);
		if (amstrong == n) {
			System.out.println("this is an amstrong number");
		} else {
			System.out.println("this is not an amstrong number");

		}

	}

}
