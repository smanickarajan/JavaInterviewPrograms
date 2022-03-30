package com.corejava.interviewquestions;

import java.util.Arrays;

public class SmallestandLargestNumberArray {

	public static void main(String[] args) {
		int[] num= {2,5,-6,8,-10,-100,89876,89877};
		int largest=num[0];
		int smallest=num[0];
		
		for (int i=1;i<num.length;i++) {
			
			if(num[i]>largest)
				largest=num[i];
			else if (num[i]<smallest)
				smallest=num[i];
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("Largest :"+largest);
		System.out.println("Smallest :"+smallest);
		
		
		//Using Array Sort method
		
		Arrays.sort(num);
		System.out.println("Sorted array " +Arrays.toString(num));
		System.out.println("Largest :"+num[num.length-1]);
		System.out.println("Smallest :"+num[0]);

	}

}
