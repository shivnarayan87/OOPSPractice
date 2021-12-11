package com.oopsfeature.constructor;

public class TestConsructor {
	private String sname;
	private int rollno;
	
	TestConsructor(String name, int rollno){
		//super();
		this.sname=name;
		this.rollno=rollno;
		
	}
	
	protected TestConsructor(TestConsructor t) {
		
		sname=t.sname;
		rollno=t.rollno;
		
		// TODO Auto-generated constructor stub
	}
	public TestConsructor() {
		
	}
	public void display() {
		System.out.println("name:"+sname+"::"+"rollno:"+rollno);
	}
	
	public static void main(String[] args) {
		TestConsructor tc= new TestConsructor("shiv",10);
		TestConsructor tc1= new TestConsructor(tc);
		TestConsructor tc2= new TestConsructor();
		tc.display();
		tc1.display();
		
//		System.out.println("name:"+tc.sname+"::"+"rollno:"+tc.rollno);
	}
	

}
