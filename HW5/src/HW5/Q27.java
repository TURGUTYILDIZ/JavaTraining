package HW5;

public class Q27 {
	
	public static void main(String...strings ) {
	
		boolean balloonInflated = false;
		
		do {
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
				}
			} while (! balloonInflated); // d�ng�den ��k�l�r ��nk� "!true" d�necektir.
		
		System.out.println("done");

	}
	
}
