package com.corejava.interviewquestions;

import java.util.Scanner;

public class PalindromWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String");
		String S= sc.next();
		String orgstring=S;
	
		int len= S.length();
		String rev="";
		
		for (int i=len-1;i>=0;i--) {
			rev=rev+S.charAt(i);
		}
		System.out.println("reversed String is "+rev );
		
		if (orgstring.equalsIgnoreCase(rev))
			System.out.println(orgstring+" Plaindrome");
		else
			System.out.println(orgstring+" not a Plaindrome");
		

	}

}
