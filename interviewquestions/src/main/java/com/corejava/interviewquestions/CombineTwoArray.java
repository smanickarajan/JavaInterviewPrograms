package com.corejava.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;



public class CombineTwoArray {

	public static void main(String[] args) {
		String[] batsmen= {"dhoni","sachin"};
		String[] bowler= {"Jaddu","Ashwin"};
		Stream<String> sbat = Arrays.stream(batsmen);
		Stream<String> sbow = Arrays.stream(batsmen);
		
		String fullteam[]=Stream.concat(sbat, sbow).toArray(size->new String[size]);
		
		for (String s:fullteam) {
			System.out.println(s);
		}
		
		List<String> resultList = new ArrayList<>(batsmen.length + bowler.length);
		
	    Collections.addAll(resultList, batsmen);
	    Collections.addAll(resultList, bowler);
	    
	    System.out.println(resultList.toString());
	}

}
