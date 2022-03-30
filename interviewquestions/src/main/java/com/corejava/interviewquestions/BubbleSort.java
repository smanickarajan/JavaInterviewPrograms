package com.corejava.interviewquestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 60, 5 };
		int b[] = { 4, 2, 1, 60, 5 };

		int n = a.length;
		
		
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		System.out.println("Ascending order: " + Arrays.toString(a));

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (b[j] < b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}

		System.out.println("Descending Order: " + Arrays.toString(b));

	}

}
