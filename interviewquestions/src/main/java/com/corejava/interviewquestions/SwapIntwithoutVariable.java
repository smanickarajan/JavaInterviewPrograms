package com.corejava.interviewquestions;

public class SwapIntwithoutVariable {

	public static void main(String[] args) {
		
		//using addition
		int x=5;
		int y=10;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x :"+x);
		System.out.println("y :"+y);

		
		//using multiplier
		int a=5;
		int b=10;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		//using XOR
		int i=5;
		int j=10;
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println("i :"+i);
		System.out.println("j :"+j);
		
		//using single statement
		
		int c=5;
		int d=10;
		d=c+d-(c=d);
		System.out.println("c :"+c);
		System.out.println("d :"+d);
	}

}
