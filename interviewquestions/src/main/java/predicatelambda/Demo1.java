package predicatelambda;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		
		System.out.println(p.test(5));
		System.out.println(p.test(20));
		
		
		Predicate<String> p1=s->(s.length()>4);
		System.out.println(p1.test("welcome"));
		System.out.println(p1.test("abc"));
		
		
		String[] names= {"David","Sck","adf","fdg","manick"};
		
		for (String s:names) {
			if(p1.test(s)) {
				System.out.println(s);
			}
			
		}
	}

}
