package com.oopsfeature.overriding;

import java.io.IOException;

public class Child extends Parrent {
	
@Override
  public void marry() {
	// TODO Auto-generated method stub
	System.out.println("isha or lara");
	//super.marry();
}
public static void main(String[] args) throws IOException{
	Child c= new Child();
	c.marry();
	Parrent p= new Child();
	p.marry();
	Parrent p1= new Parrent();
	p1.marry();
}

}
