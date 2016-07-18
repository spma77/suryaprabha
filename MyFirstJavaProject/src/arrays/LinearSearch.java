package arrays;

//linear search = not in a sequential order

public class LinearSearch{
	
	public static int linearsearch(int[]arr,int searchelement){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==searchelement){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]arr = {12,13,11,65,4,3};
		int search = linearsearch(arr,65);
		System.out.println("the search element index is:"+search);
	}
	}