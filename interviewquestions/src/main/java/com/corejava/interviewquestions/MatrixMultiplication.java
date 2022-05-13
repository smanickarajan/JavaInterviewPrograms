package com.corejava.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no rows for first matrix");
		int rowsinFirst = sc.nextInt();

		System.out.println("Enter the no cols in second or Rows in second Matrix");
		int colsinFirstandRowsiSecond = sc.nextInt();
		
		System.out.println("Enter the no cols for second matrix");
		int colsinSecond = sc.nextInt();
		int matrix1[][] = new int[rowsinFirst][colsinFirstandRowsiSecond];
		int matrix2[][] = new int[colsinFirstandRowsiSecond][colsinSecond];
		int product[][] = new int[rowsinFirst][colsinSecond];
		
		System.out.println("Enter the matrix1 data");

		for (int i = 0; i < rowsinFirst; i++) {
			for (int j = 0; j < colsinFirstandRowsiSecond; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the matrix2 data");

		for (int i = 0; i < colsinFirstandRowsiSecond; i++) {
			for (int j = 0; j < colsinSecond; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("matrix1 is");
		for (int[] r:matrix1) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println("-----------------------------------------------------------");	
		System.out.println("matrix2 is");
		for (int[] r:matrix2) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0;i<rowsinFirst;i++) {
			for(int j=0;j<colsinSecond;j++) {
				for(int k=0;k<colsinFirstandRowsiSecond;k++) {
				product[i][j]+=matrix1[i][k]*matrix2[k][j];	
				}
			}
		}
		
		System.out.println("Product is");
		for (int[] r:product) {
			System.out.println(Arrays.toString(r));
		}
	}

}
