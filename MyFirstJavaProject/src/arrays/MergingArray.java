package arrays;

public class MergingArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 16, 17, 18, 19, 110 };
		int arr3[] = new int[10];
		int i = 0;
		for (int k = 0; k < arr1.length; k++) {
			arr3[i] = arr1[k];
			i++;
		}
		int j = 0;
		for (j = 0; j < arr2.length; j++) {
			arr3[i] = arr2[j];
			i++;

		}
		System.out.println(arr3[0]+  " , " +arr3[1]+ " , "+ arr3[2]+ " , "+arr3[3]+ " , " + 
							arr3[4]+ " , "+ arr3[5]+ " , "+arr3[6]+ " , "+arr3[7]+ " , "+arr3[8]+" ,"
							+arr3[9]);
	}
}