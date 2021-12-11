package com.oopsfeature.inheritance;

public class CarLoan extends Loan {
	
	public void carLoan() {
		System.out.println("child carloan specific method");
	}
	
	public static void main(String[] args) {
		
//	child class object refference hold parrent method and own also
		
		  CarLoan cl= new CarLoan();
		  cl.carLoan(); 
		  cl.parrentLoan();
		 
		  // child class cannot hold parrent type object
//		  CarLoan carloan= new Loan();
		  
//		  parrent class hold child type but not able to access child method.
		  
		  Loan loan= new CarLoan();
		  loan.parrentLoan();
		 
		 
		
		
	}

}
