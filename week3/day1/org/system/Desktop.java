package org.system;

import week3.day1.Calculator;
import week3.day1.MyCalculator;

public class Desktop extends Computer {
	
	
	public void desktopSize() {
		System.out.println("Desktop Size");
	}
		public static void main(String[] args) {
			
			Desktop objdesk= new Desktop();
			objdesk.computermodel();
			objdesk.desktopSize();
			
		
	}
}
