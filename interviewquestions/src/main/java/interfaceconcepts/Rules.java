package interfaceconcepts;

public interface Rules {

	
	public int num=5;
	public static String name="manick";
	public static final int num1=9;
	
	
	void display() ;
	static void show() {
		System.out.println("Showing interface");
	}
	
	default void write() {
	System.out.println("writing interface");
	
	
}
}
