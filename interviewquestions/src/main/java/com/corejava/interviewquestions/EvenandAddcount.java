package com.corejava.interviewquestions;


public class EvenandAddcount {

	public static void main(String[] args) {
		int num=125644978;
		int evencount = 0,addcount=0;
		while (num>0) {
			int digit=num%10;
			if (digit%2==0)
				evencount++;
			else
				addcount++;
			num=num/10;
			
		}
		
		System.out.println("Evennumbers :"+evencount);
		System.out.println("Addnumbers :"+addcount);

	}

}
