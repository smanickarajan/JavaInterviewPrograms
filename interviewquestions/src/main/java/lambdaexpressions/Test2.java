package lambdaexpressions;

public class Test2 {

	public static void main(String[] args) {
		Cab2 cab=()->{
			
			return ("Ola2");};
		
		System.out.println(cab.book());

	}

}
