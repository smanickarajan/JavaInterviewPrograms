package com.corejava.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter the no cols");
		int cols=sc.nextInt();
		
		System.out.println("Enter the matrix data");
		int inputmatrix[][]=new int[rows][cols];
		int transposematrix[][]=new int[cols][rows];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				inputmatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Input matrix  is");
		for (int[] r:inputmatrix) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println("-----------------------------------------------------------");	
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposematrix[i][j]=inputmatrix[j][i];
			}
		}
		System.out.println("Transpose matrix  is");
		for (int[] r:transposematrix) {
			System.out.println(Arrays.toString(r));
		}

	}

}
