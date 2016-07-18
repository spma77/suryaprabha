package loops;

public class Fibonacci {
	public static void main(String[] args) {
		int j=0, a=1,b=1;
		System.out.println("1 1");
		
		while(j<=50){
			j = a+b;
			System.out.println(j+ " ");
			a=b;
			b=j;
			
		}
		
		
	}
	

}
