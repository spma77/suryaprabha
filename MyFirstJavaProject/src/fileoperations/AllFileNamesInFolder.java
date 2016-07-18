package fileoperations;

import java.io.File;

public class AllFileNamesInFolder {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\suryaprabha\\Desktop\\io.demo");
		
		String[]fileList = f.list();
		for(String name : fileList){
			System.out.println(name);
		}
	}

}
