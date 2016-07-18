package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		
	List<Integer>list = new ArrayList<Integer>();
	list.add(500);
	list.add(1000);
	list.add(1500);
	Integer tempArray[] =new Integer[list.size()];
	tempArray = list.toArray(tempArray);
	System.out.println(tempArray[0]);
	System.out.println(tempArray[1]);
	System.out.println(tempArray[2]);
	}
	
}
