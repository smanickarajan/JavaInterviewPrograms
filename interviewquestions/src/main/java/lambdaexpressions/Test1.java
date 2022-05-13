package lambdaexpressions;

public class Test1 {

	public static void main(String[] args) {
		Cab1 cab1=(source,destination)->System.out.println("Ola for "+source+" to "+destination);
		
		cab1.book("nagercoil","chennai");

	}

}
