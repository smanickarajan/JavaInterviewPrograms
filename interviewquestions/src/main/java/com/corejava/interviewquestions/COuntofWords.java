package com.corejava.interviewquestions;

public class COuntofWords {
	public static void main(String[] args) {
		
		String S="NaveenAutomationLabsYoutube";
		int count=0;
		for (int i=0;i<S.length();i++) {
			if(S.charAt(i)>='A' && S.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
		
		int count1=0;
		for (int i=0;i<S.length();i++) {
			if(S.charAt(i)>=65 && S.charAt(i)<=90) {
				count1++;
			}
		}
		System.out.println(count1);
		
		int count2=0;
		for (int i=0;i<S.length();i++) {
			if(Character.isUpperCase(S.charAt(i))) {
				count2++;
			}
		}
		System.out.println(count2);
	}
	
	
}
	

