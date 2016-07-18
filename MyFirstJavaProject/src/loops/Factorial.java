package loops;

public class Factorial {
	public static void main(String[] args) {
		Factorial f= new Factorial();
		int factOut = f.fact(-100);
		System.out.println(factOut);
	}	
	
	public int fact (int n){
		if(n<0){
			return -1;
		}
		if (n==0 || n==1)	{
			return 1;
		}
		return n*fact(n-1);
	}
}
