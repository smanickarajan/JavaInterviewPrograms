package predicatelambda;

import java.util.function.Predicate;

public class Demo3 {

	public static void main(String[] args) {
		int a[]= {5,10,15,24,65,90};
		
		Predicate<Integer> p1=i->i>20;
		Predicate<Integer> p2=i->i%2 ==0;
		Predicate<Integer> p3 = p1.negate();
		System.out.println(" Greater the 20 and Even numbers are:");
	
		for (Integer b:a) {
		if(p1.and(p2).test(b)) {
			System.out.println(b);
		}
		}
		
		
		System.out.println(" Greater the 20 or Even numbers are:");
		
		for (Integer b:a) {
		if(p1.or(p2).test(b)) {
			System.out.println(b);
		}
		}
		
		
System.out.println(" Negate:");
		
		for (Integer b:a) {
			if(p3.test(b)) {
				System.out.println(b);
			}
		}

	}

}
