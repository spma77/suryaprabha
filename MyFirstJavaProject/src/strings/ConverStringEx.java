package strings;

import java.lang.reflect.Array;

public class ConverStringEx {
	public static void main(String[] args) {
		String original= "This is nice"; //declare a string
		String convert="";
		//we have to convert the string now
		//converting the original string into array in words
	     String[] words=original.split(" ");
	     for(int i=0; i<=words.length-1;i++){
	    	 convert=convert+words[i]+(i+1)+" ";
	    	 
	     }
	     System.out.println(convert);
	     
	     
	     
	     System.out.println();
	     
	     
		
		
				
	}

}
