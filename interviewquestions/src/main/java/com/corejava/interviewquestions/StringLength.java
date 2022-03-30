package com.corejava.interviewquestions;

public class StringLength {

	public static void main(String[] args) {
		String str="testing";
		System.out.println(str.split("").length);
		System.out.println(str.lastIndexOf(""));
		System.out.println(str.toCharArray().length);
		
		int count=0;
		for (char s:str.toCharArray()) {
			count++;
		}
System.out.println(count);
	}

}
