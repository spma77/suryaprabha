package exceptionhandling;

public class Exception_Example {
	public static void main(String[] args) {
		Integer intval = null;
		try {
			int n = intval.intValue();
		} catch (NullPointerException e) {
			System.out.println("Variable is null");
		} finally {
			System.out.println("Inside Finally");
		}
		
	}

}
