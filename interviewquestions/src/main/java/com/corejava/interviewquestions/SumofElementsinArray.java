package com.corejava.interviewquestions;

public class SumofElementsinArray {

	public static void main(String[] args) {
		int a[] = { 5, 4, 7, 6, 8 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum :" + sum);

		for (int value : a) {
			sum1 = sum1 + value;
		}
		System.out.println("Sum :" + sum1);
	}
}