package com.corejava.interviewquestions;

public class FindSubstring {

	public static void main(String[] args) {
		String str="Automation Testing with Java";
	Object result = str.matches(".*Java.*");
	System.out.println(result.toString());

	}

}
