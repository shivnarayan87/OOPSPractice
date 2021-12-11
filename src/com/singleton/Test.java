package com.singleton;


public class Test {
private static Test t= null;
	
	private Test() {
		
	}
	
	//assiginging multiple reffrence to same object
	public static Test getTest() {
		if(t==null) {
			t= new Test();
		}
		return t;
	}
	//protect from cloning
	public Test clone() {
		return this;
		
	}
	
	public static void main(String[] args) {
		
		Test t1=Test.getTest();
		Test t2=Test.getTest();
		
		//this below is proof for singlton object and not clobanble , same hash code is ginving
		// t1,t2,t3 poiniting same single object
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		Test t3=t1.clone();
		System.out.println(t3.hashCode());
		
		
	}

}
