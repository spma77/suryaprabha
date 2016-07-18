package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverOrderUsingListIterator {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator iter = list.listIterator(list.size());
		while(iter.hasPrevious()){
			System.out.println(iter.previous());
		}
	}

}
