package com.corejava.interviewquestions;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 6, 5 };
		int a1[] = { 2, 4, 3, 6, 5 };
		Integer a2[] = { 2, 4, 3, 6, 5 };

		// Approach1
		Arrays.parallelSort(a);
		System.out.println("Parallel Sort" + Arrays.toString(a));

		// Approach2
		Arrays.sort(a1);
		System.out.println("Parallel Sort" + Arrays.toString(a1));
		
		//Approach3
		Arrays.sort(a2,Collections.reverseOrder()); //Only object not primitive type
		System.out.println("Parallel Sort" + Arrays.toString(a2));
		

	}

}
