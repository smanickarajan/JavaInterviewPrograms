package com.corejava.interviewquestions;

public class ReverseInt {

	public static void main(String[] args) {

		// using algorithm
		int num = 12345;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			//System.out.println(rev);
			num = num / 10;

		}
		System.out.println(rev);

//using Stringbuffer
		int num1 = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(sb);
		
		//using String Builder
		int num2=7896;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num2);
		System.out.println(sbl.reverse());
	}

}
