package arrays;

public class SwappingNo {
	public static void main(String[] args) {
		int array[] = { 1, 2, 5, 6, 4 };
		int a = array[2];
		int b = array[4];
		int temp = array[0];

		temp = array [2];
		array[2] = array[4];
		
		array[4] = temp;

		System.out.println(array[0] + ", " + array[1] 
				+ ", " + array[2]+ ", " + array[3]+ ", " + array[4]);
		

	}

}
