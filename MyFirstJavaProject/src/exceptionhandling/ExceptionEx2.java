package exceptionhandling;

public class ExceptionEx2 { 

	public void test(String s) throws NumberFormatException {
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ExceptionEx2 e1 = new ExceptionEx2();
		try {
			e1.test("a;lksdjfkl");
		} catch (NumberFormatException e) {
			System.out.println("Input is not a number");
		}	
	}
}
