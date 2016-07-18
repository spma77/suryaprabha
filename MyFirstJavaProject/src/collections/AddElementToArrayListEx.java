package collections;

import java.util.ArrayList;
import java.util.List;

//To create an arraylist and add elements to it.

public class AddElementToArrayListEx {
	public static void main(String[] args) {
		//create an instance of array list
		ArrayList arraylist = new ArrayList();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		 // To search for an element in the list.
		boolean blnFound = arraylist.contains("2");
		System.out.println("Does array list contain 2 ?"+ blnFound);
		
	}

}
