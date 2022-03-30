package com.corejava.interviewquestions;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String s="100";
		System.out.println(Integer.parseInt(s));//100
		System.out.println(Double.parseDouble(s)); //100.0
		
		String u="true";
		System.out.println(Boolean.parseBoolean(u));
		
		String u1="false";
		System.out.println(Boolean.parseBoolean(u1));//false
		
		String u2="abc";
		System.out.println(Boolean.parseBoolean(u2));//false
		
		int i=100;
		System.out.println(String.valueOf(i));
		
		String j="200A";
		System.out.println(Integer.parseInt(j));//NumberFormatException
		System.out.println(Double.parseDouble(j));//NumberFormatException
	}

}
