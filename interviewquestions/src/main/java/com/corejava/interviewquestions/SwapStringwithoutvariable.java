package com.corejava.interviewquestions;

public class SwapStringwithoutvariable {

	public static void main(String[] args) {
		String a="Hello";
		String b="World!";
		
		a=a+b;
		
		b=a.substring(0, (a.length()-b.length()));
		//System.out.println(b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
