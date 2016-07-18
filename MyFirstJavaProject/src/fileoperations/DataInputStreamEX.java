package fileoperations;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEX {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\suryaprabha\\Desktop\\io.demo\\surya3.txt");
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		int num1;
		int num2;
		System.out.println("Enter the first number : ");
		num1 = Integer.parseInt(dis.readLine());
		System.out.println("Enter the second number : ");
		num2 =Integer.parseInt(dis.readLine());
		System.out.println();
		System.out.println(num1 + "*" + num2 + "="+(num1*num2));
		
		
		
		
	}
	
		

}
