package com.corejava.interviewquestions;

import java.util.Scanner;

public class PlaindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Number");
		int num= sc.nextInt();
		int orgnum=num;
		int rev=0;
		while (num!=0) {
		rev=rev*10+(num%10);
		num=num/10;
		}
		System.out.println("reversed number is "+rev );
		
		if (orgnum==rev)
			System.out.println(orgnum+" Plaindrome");
		else
			System.out.println(orgnum+" not a Plaindrome");

	}

}
