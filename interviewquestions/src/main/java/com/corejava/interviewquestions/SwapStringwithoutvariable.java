package com.corejava.interviewquestions;

public class SwapStringwithoutvariable {

	public static void main(String[] args) {
		String a="Hello";
		String b="World!";
		
		a=a+b;
		System.out.println(a.length());
		System.out.println(b.length());
		b=a.substring(0, (a.length()-b.length()));
		System.out.println(b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
