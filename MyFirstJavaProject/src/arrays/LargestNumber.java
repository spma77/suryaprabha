package arrays;

public class LargestNumber {
	// find a largest no on a given array
	public static void main(String[] args) {
	
		//Create an array of integers

		int array[] = { 20, 40, 50, 70, 5 };
		int temp = array[0];

		for (int i = 1; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
				
			}

		}
		System.out.println(temp);
	}
}
