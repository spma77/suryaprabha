package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arraylist = new ArrayList();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		Iterator<Integer>itr = arraylist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
