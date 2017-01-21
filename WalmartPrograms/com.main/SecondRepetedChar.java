import java.util.HashMap;
import java.util.Map;

public class SecondRepetedChar {
	/*public static void main(String[] args) {
		String input = "Suryaprabha";
		printSecondCharacter(input);
	}

	public static void printSecondCharacter(String input) {
		Map<Character, Integer> map = new HashMap<>();

		boolean foundFirst = false;  //to find and eliminate the first repeated character
		char[] charArr = input.toCharArray();  //created an array

		for (int i = 0; i < charArr.length; i++) {  //go through the characters in string
			if (map.containsKey(charArr[i])) {     //if the map contain's the character
				if (foundFirst) {
					System.out.println("The second repeted char is: " + charArr[i]);
					break;
				} else {
					foundFirst = true;           //found the first repeated character condition becomes true
				}
			} 
			else {
				map.put(charArr[i], 1);          //then add it to the map
			}
		}

	}*/
	public static void duplicate(String s){
		int count = 0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
					if(count==2){
						System.out.println(s.charAt(i));
					}
					break;
					}
				}
			}
		}
	public static void main(String[] args) {
		SecondRepetedChar.duplicate("Suryaprabha");
	}
	}

