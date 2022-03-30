package com.corejava.interviewquestions;

import java.util.StringJoiner;

public class StringJoinerCOncept {

	public static void main(String[] args) {
		StringJoiner str=new StringJoiner(",","{","]") ;
		str.add("Test");
		str.add("Regression");
		str.add("Functional");
		System.out.println(str.toString());

	}

}
