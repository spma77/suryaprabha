
public class MissingNo {
	static int a[]= {10,15,20,25,30,40};
	
	public static void main(String[] args) {
		int prev =a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i] - prev != 5) {
				System.out.println("The missing number is " + (prev+5));
				break;
			}
			prev=a[i];
		}
	}

}
