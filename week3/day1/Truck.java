package week3.day1;

public class Truck extends Vehicle {
	
	public void soundHorn() {
		System.out.println("soundHorn");
		}

	public static void main(String[] args) {
		Truck myTruck= new Truck();
		myTruck.applyBrake();
	}
}
