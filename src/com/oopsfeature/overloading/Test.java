package com.oopsfeature.overloading;

public class Test {
	//same method with different argument type
	
	public void m1() {
		System.out.println("no-arg");
	}
	public void m1(int i) {
		System.out.println("one-arg integer");
	}
	public void m1(double i) {
		System.out.println("one-arg double");
	}

	public static void main(String[] args) {
		Test t= new Test();
		t.m1();
		t.m1(12);
		t.m1(2.0);
	}
}
