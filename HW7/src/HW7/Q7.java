package HW7;

class Automobile {
	private final String drive() {
		return "Driving vehicle";
	}
}

class Car extends Automobile {
	protected String drive() {
		return "Driving car";
		}
}

public class Q7 extends Car {
	public final String drive() { // subclass nesnesisi bu kod gövdesini çalýþtýracaktýr.
		return "Driving electric car";
	}
	
	public static void main(String[] wheels) { 
		
		final Car car = new Q7(); // car classýnýn subclassýndan bir nesne oluþturuluyor.
		final Car car2 = new Car(); // parent class çalýþýr.
		
		System.out.println(car.drive());  // subclass
		System.out.println(car2.drive()); // parentclass
		
	}
	
}