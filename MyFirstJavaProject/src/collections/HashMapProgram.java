package collections;

import java.util.HashMap;

public class HashMapProgram {
	
	//To create a hashmap.
	
	public static void main(String[] args) {
		System.out.println("HashMap program");
		HashMap<Integer, String> HMap = new HashMap<Integer, String>();
		HMap.put(1, "one");
		HMap.put(2, "two");
		HMap.put(3, "three");
		HMap.put(4, "four");
		HMap.put(5, "five");
		
		System.out.println(HMap.size());
		//To search for a key in the created map and then returns its value.
		System.out.println(HMap.get(2));
		
		
	}

}
