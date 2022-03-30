package com.corejava.interviewquestions;

public class NumberofDigits {

	public static void main(String[] args) {
		int num = 1456892;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
