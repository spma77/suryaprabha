package general;

public class PrintNubersWithRecurtion {
	 static void printNumUp(int num)
	    {
	        System.out.println(num);
	        if (num < 10)
	            printNumUp(num + 1);
	    }
	     public static void main(String[] args) {
			printNumUp(1);
		}  
	    

}
