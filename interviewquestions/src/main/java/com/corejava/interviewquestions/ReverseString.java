package com.corejava.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String
		//Difference between String and StringBuffer
		//Do we have reverse function in String?
		
		
		//Using Loop
		String S="Selenium";
		int len= S.length();
		String rev="";
		
		for (int i=len-1;i>=0;i--) {
			rev=rev+S.charAt(i);
		}
		System.out.println(rev);
		
		//using StringBuffer
		
		StringBuffer sb=new StringBuffer(S);
		System.out.println(sb.reverse());
		
		//using ArrayList
		
		char[] hello = S.toCharArray();
        List<Character> trial1 = new ArrayList<>();
 
        for (char c : hello)
            trial1.add(c);
 
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
	}


