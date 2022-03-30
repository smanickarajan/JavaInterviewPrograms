package com.corejava.interviewquestions;

import java.util.Scanner;

public class CountNoofWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String");
		String S= sc.nextLine();
		
		int count=1;
		
		for (int i=0;i<S.length();i++) {
			if((S.charAt(i)==' ' ) && S.charAt(i+1)!=' '){
				count++;
			}
		}
System.out.println(count);
	}

}
