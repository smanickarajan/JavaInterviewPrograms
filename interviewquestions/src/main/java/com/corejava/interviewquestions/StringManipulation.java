package com.corejava.interviewquestions;



public class StringManipulation {

	public static void main(String[] args) {
		String str="The rains have started here";
		String str1="The rains Have started here";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));//first occurance
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//second occurance
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello")); //-1
		
		//string comparison
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(3, 20));//rains have start
		
		//trim
		String s="  Hello World ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String test="Helo_world_test";
		String[] splitstring = test.split("_");
		for (int i=0;i<splitstring.length;i++) {
			System.out.println(splitstring[i]);
		}
		
		String s2="API";
		System.out.println(s2+" Testing");
		System.out.println(s2.concat("Testing"));
		
		String S3="Hello";
		String S4="World";
		int x=100;
		int y=200;
		double a=5.5;
		double b=4.4;
		System.out.println(S3+S4);
		System.out.println(x+y);
		System.out.println(S3+S4+x+y);//HelloWorld100200
		System.out.println(x+y+S3+S4);//300HelloWorld
		System.out.println(S3+S4+a+b);
		System.out.println(a+b+S3+S4);
		

	}

}
