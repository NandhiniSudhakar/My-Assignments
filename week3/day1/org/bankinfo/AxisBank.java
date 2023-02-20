package org.bankinfo;

import org.student.Student;

public class AxisBank extends BankInfo  {
	public void deposit() {
		System.out.println("Child Deposit rate is 8% ") ;
	}
public static void main(String[] args) {
		
		AxisBank objAxisbank= new AxisBank();
		
		objAxisbank.deposit();
		objAxisbank.saving();
		objAxisbank.fixed();
}	
}

