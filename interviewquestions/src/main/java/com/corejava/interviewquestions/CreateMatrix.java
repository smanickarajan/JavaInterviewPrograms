package com.corejava.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter the no cols");
		int cols=sc.nextInt();
		
		System.out.println("Enter the matrix data");
		int data[][]=new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();		
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
for (int[] r:data) {
	for (int x:r) {
		System.out.print(x+" ");
	}
	System.out.println();
}

System.out.println("-----------------------------------------------------------");

for (int[] r:data) {
	System.out.println(Arrays.toString(r));
}
System.out.println("-----------------------------------------------------------");
System.out.println(Arrays.deepToString(data));
}
}
