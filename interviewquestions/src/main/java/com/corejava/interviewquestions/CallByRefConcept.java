package com.corejava.interviewquestions;

public class CallByRefConcept {
	int p;
	int q;

	public static void main(String[] args) {
		CallByRefConcept obj = new CallByRefConcept();
		obj.p = 10;
		obj.q = 20;
		obj.swap(obj);
		System.out.println(obj.p);//20
		System.out.println(obj.q);//10
	}

	public void swap(CallByRefConcept t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;

	}

}
