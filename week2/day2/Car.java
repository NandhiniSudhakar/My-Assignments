package week2.day2;

public class Car {
	
	public static void main(String[] args) {
		
	
		Car obj=new Car();
		System.out.println("Registration Number : " +obj.getRegistrationNumber());
		System.out.println("Owner Name :" +obj.getOwnerName());
	obj.printModelName("Model name : " + "Swift");
		System.out.println("IsPunctured?:" +obj.isPunctured());
System.out.println("Difference :" +obj.subtractTwoNumbers(11,5));
		System.out.println("Multiply :" +obj.multiplyThreeNumbers(4,8,2));
		System.out.println("Divide :" +obj.divideTwoNumbers(8,2));
	}


	public int getRegistrationNumber() {
	return 7890;
}
	  
private String getOwnerName() {
	return "Nandhini";
}

void printModelName(String modelName) {
	System.out.println("Model name " +"Swift");
}
public boolean isPunctured() {
	return true;
	
}

public int subtractTwoNumbers(int a, int b) {
	return (a-b);
}

public int multiplyThreeNumbers(int a, int b,int c) {
	return (a*b*c);
	
}
public int divideTwoNumbers(int a, int b) {
	return a/b;
	









	
	
	
	
			
	
	
			
	
		  
		  
	  
		
	
	
}
}
