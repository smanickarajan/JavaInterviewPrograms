package com.corejava.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		String s="Java is java best language is java";
		String[] words=s.split(" ");
		Map<String,Integer> wordcount=new HashMap<>();
		for (String word:words) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}
			else {
				wordcount.put(word.toLowerCase(), 1);
			}
		
		}
		
		Set<String> wordsinString = wordcount.keySet();	
		for(String word:wordsinString) {
			
			if (wordcount.get(word)>1)
			System.out.println(word +"-"+wordcount.get(word));
		}

	}

}
