package com.corejava.interviewquestions;

public class StarPattern2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("x");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
// pyramid Pattern
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" x"); //add space before *
			}
			System.out.println();
		}
	}

}
