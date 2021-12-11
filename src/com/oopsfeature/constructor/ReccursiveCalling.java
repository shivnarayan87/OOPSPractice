package com.oopsfeature.constructor;

public class ReccursiveCalling {
	//private int i;
	
	public ReccursiveCalling(int i) {
		//this();
	}
	public ReccursiveCalling() {
		this(3);
		
	}
	public static void main(String[] args) {
		ReccursiveCalling rc= new ReccursiveCalling();
		ReccursiveCalling rc1= new ReccursiveCalling(4);
		
	}

}
