package HW7;

abstract class Parallelogram {
	private int getEqualSides() {return 0;}
} 

abstract class Rectangle extends Parallelogram {
	public int getEqualSides() {return 2;} // x1  // static metod static olmayan metodu ezemez.
													//	static deðeri kaldýrýlýrsa derlenir.
}

public final class Q31 extends Rectangle {
	
	public int getEqualSides() {return 4;} // x2  //  hata bu satýrda gerçekleþir. static metod silinmelidir:
	
	public static void main(String[] corners) {
		
		final Q31 myFigure = new Q31(); // x3
		System.out.print(myFigure.getEqualSides());
		
	}
}
	

