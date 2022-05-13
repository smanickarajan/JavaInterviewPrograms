package com.corejava.interviewquestions;

public class AlphapeticPattern {

	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (65 + j) + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");
		int alpha1 = 97;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (97 + j) + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");

		int alpha3 = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha3) + " ");
			}
			alpha3++;
			System.out.println();
		}

		System.out.println("-------------------------------------------");

		int alpha4 = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha4) + " ");
			}

			System.out.println();
		}
	}

}
