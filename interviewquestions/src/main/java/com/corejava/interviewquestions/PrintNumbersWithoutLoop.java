package com.corejava.interviewquestions;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		printNum(3,9);

	}
public static void printNum(int startnum,int endnum) {
	if(startnum<=endnum) {
		System.out.println(startnum);
		startnum++;
		printNum(startnum,endnum);
	}
}
}
