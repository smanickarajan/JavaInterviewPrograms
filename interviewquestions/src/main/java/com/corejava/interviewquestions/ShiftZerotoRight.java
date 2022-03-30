package com.corejava.interviewquestions;

import java.util.Arrays;

public class ShiftZerotoRight {

	public static void main(String[] args) {
		int[] a= {0,2,0,0,3,0,4};
		if(a.length==1) {
			System.out.println(Arrays.toString(a));
		}
		else {
			int[] newarray=new int[a.length];
			int count=0;
		for (int num:a) {
			if(num!=0) {
				newarray[count]=num;
				count++;
			}
		}
		System.out.println(Arrays.toString(newarray));
		}
		
		

	}

}
