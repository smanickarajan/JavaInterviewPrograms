package com.corejava.interviewquestions;

public class SearchElementinArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		boolean flag = false;

		int searchele = 30;

		for (int i = 0; i < a.length; i++) {
			if (searchele == a[i]) {
				System.out.println("Element found at " + i);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("Element not found");
	}

}
