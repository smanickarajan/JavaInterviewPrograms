package com.corejava.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no rows");
		int rows = sc.nextInt();

		System.out.println("Enter the no cols");
		int cols = sc.nextInt();
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		int sum[][] = new int[rows][cols];
		int sub[][] = new int[rows][cols];
		System.out.println("Enter the matrix1 data");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the matrix2 data");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
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
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sub[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		
		System.out.println("Addition is");
		for (int[] r:sum) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("subtraction is");
		for (int[] r:sub) {
			System.out.println(Arrays.toString(r));
		}

	}

}
