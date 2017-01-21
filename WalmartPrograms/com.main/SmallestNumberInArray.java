
public class SmallestNumberInArray {
	// find a smallest no on a given array
		public static void main(String[] args) {
		
			//Create an array of integers

			int array[] = { -2,5,6,7,8};
			int temp = array[0];

			for (int i = 1; i > array.length; i--) {
				if (temp > array[i]) {
					temp = array[i];
					
				}

			}
			System.out.println(temp);
		}

}
