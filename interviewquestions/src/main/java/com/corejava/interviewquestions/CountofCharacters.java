package com.corejava.interviewquestions;

public class CountofCharacters {

	public static void main(String[] args) {
		String S="Java Programming Java OOPS";
		
		//count the a character
		int length=S.length();
		
		int lenthafterremoval=S.replace("a", "").length();
		
	System.out.println(length-lenthafterremoval);

	}

}
