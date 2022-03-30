package com.corejava.interviewquestions;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//using regex
		
		String S="S&^%$$##@!)(*:}{|?><elenium test&^%ing";
		S=S.replaceAll("[^A-Z a-z0-9]", "");
		System.out.println(S);

	}

}
