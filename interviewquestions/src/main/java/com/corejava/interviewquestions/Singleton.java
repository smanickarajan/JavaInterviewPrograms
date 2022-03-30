package com.corejava.interviewquestions;

public class Singleton {
	
	private static Singleton singleton_instance=null;
	
	public String str;
	
	private Singleton() {
		str="hello world";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance=new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);//HELLO WORLD
		System.out.println(y.str);//HELLO WORLD
		System.out.println(z.str);//HELLO WORLD
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);//hello world
		System.out.println(y.str);//hello world
		System.out.println(z.str);//hello world

	}

}
