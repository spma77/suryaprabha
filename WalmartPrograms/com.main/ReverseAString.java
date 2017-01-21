
public class ReverseAString {
	static String reverse(int a, int b, String s) {
		String res = "";
		for (int i = a; i >= b; i--) {
			res = res + s.charAt(i);

		}
		return res;
		

	}
	public static void main(String[] args) {
		String s = "WALMART";
		int mid = s.length() /2;
		String res1 = reverse(mid-1,0,s);
		res1 = res1 + s.charAt(mid);
		String res2 = reverse(s.length()-1,mid+1,s);
		String result ="";
		result = res1+res2;
		
		System.out.println(result);
		
	}

}
