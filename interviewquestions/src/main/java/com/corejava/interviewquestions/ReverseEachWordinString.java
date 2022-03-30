package com.corejava.interviewquestions;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		
		//Approach1
		String str="Welcome To Java";
		String revstring="";
		
		String[] words = str.split(" ");
		
		for (String w:words) {
			String revword="";
			for (int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			revstring=revstring+revword+ " ";
		}
		
		System.out.println(revstring);
		
		//Approach2:
		
		String revstring2="";
		
		for (String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revstring2=revstring2+sb.toString()+" ";
		}
		System.out.println(revstring2);
	}

}
