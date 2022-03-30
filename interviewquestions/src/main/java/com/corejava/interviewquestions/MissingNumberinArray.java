package com.corejava.interviewquestions;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int[] num = { 74, 75, 77, 78 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		for (int i = 74; i <= 78; i++) {
			sum1 = sum1 + i;
		}

		System.out.println("Missing Number is :" + (sum1 - sum));
	}

}
