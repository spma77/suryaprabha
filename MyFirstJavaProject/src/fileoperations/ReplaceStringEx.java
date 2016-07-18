package fileoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStringEx {
	public static void main(String[] args) throws IOException {
		String replace = "hi";
		String search = "hello";
		
		//Reading file into memory
		FileReader file= new FileReader ("C:\\Users\\suryaprabha\\Desktop\\io.demo\\input1.txt");
		BufferedReader  f = new BufferedReader(file);//its pulling the contents in to the memory

		//this is to read the data from buffered reader into a variable
		StringBuffer s = new StringBuffer();
		String str = f.readLine();
		while(str != null) {
			s.append(str); //Concatenate
			str = f.readLine();
		}
		
		//This is for doing the search and replace
		String fileStr = "";
		if (s.toString().contains(search)) {
			fileStr = s.toString().replaceAll(search, replace);
		}
		System.out.println(" This is " + fileStr);
		
		//This is to write the updated string back to a new file
		FileWriter fos = new FileWriter("C:\\Users\\suryaprabha\\Desktop\\io.demo\\input2.txt");
		fos.write(fileStr);
		fos.close();
	}

	private static Readable replaceAll(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
