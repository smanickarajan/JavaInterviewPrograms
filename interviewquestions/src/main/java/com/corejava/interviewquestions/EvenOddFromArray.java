package com.corejava.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				even.add(a[i]);
			else
				odd.add(a[i]);
		}

		System.out.println("Even Numbers are " + even);
		System.out.println("Odd Numbers are " + odd);
	}

}
