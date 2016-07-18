package collections;

import java.util.ArrayList;
import java.util.List;

public class TextEx {
	public static void main(String[] args) {
		List<String> testMap = new ArrayList<String>();
		List<String> testMap1 = new ArrayList<String>();
		testMap.add("a1");
		testMap.add("a2");
		testMap.add("a3");
		testMap.add("a4");
		testMap.add("a5");

		testMap1.add("b1");
		testMap1.add("b2");
		testMap1.add("b3");
		testMap1.add("b4");
		testMap1.add("b5");

		String testString = "";
		for (int i = 0; i < testMap.size(); i++) {

			if (i > 0) {
				testString = testString + ",";
			}

		}

	}

}
