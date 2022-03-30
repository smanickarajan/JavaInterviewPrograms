package com.corejava.interviewquestions;

public class LargestNumber {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=125;
		
		int largest= a>b?a:b;
		largest=c>largest?c:largest;
		System.out.println(largest);

	}

}
