package strings;

public class ReversWordsInAString {
	public static void main(String[] args) {
		//My name is Prabha
		//Prabha is name My
		String str =  "My name is Prabha";
		String a[] = str.split(" ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println(" ");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+ " ");
		}
	}

}
