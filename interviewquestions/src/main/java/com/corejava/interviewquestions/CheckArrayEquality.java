package com.corejava.interviewquestions;

import java.util.Arrays;

public class CheckArrayEquality {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]={1,2,3,4,5};
		
		//logic1
	boolean status = Arrays.equals(a1, a2);
	if (status)
		System.out.println("Equal");
	else
		System.out.println("Not Equal");

	
	//logic2
	boolean status1=true;
	
	if (a1.length==a2.length) {
		
		for (int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				status1=false;
			}
		}
	}
	
	else {
		status1=false;
	}
	
	if (status1)
		System.out.println("Equal");
	else
		System.out.println("Not Equal");
	}

}
