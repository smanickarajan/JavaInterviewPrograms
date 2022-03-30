package com.corejava.interviewquestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String S="  Selenium    Java    Testing";
		S=S.replaceAll("\\s", "");
		System.out.println(S);

	}

}
