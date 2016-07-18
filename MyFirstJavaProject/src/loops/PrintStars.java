package loops;

public class PrintStars {
	public static void main(String[] args) {
		
		String s="*";	
		for(int i=1; i<=5;i++){
			if ( i > 1) {
				s+="*";
			}
			System.out.println(s);
		}
	}

}
