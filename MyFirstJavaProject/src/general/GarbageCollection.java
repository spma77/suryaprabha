package general;

public class GarbageCollection {
	static {
		System.out.println("this is static block");
	}
	//contains a constructor, a static block and a static method
	public GarbageCollection(){
		System.out.println("this is a constructor");
	}
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		GarbageCollection s1 = new GarbageCollection();
		GarbageCollection s2 = new GarbageCollection();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
