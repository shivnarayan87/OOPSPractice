package com.oopsfeature.overloading;

public class Demo {
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(Monkey a) {
		System.out.println("Monkey version");
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		
		Animal a= new Animal();
		d.m1(a);
		Monkey m= new Monkey();
		d.m1(m);
		Animal a1= new Monkey();
		d.m1(a1);
	}

}
