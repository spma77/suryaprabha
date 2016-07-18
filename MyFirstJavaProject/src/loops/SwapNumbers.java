package loops;

/*public class SwapNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		a = a+b; //a=9
		b = a-b; //b=4
		a = a-b; //b=5
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	
		
	}

}
*/
public class SwapNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int temp=0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}
}


