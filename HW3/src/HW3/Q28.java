package HW3;

public class Q28 {
	
	public static void main(String... in) {
		
		int intersections = 100;
		int streets = 200;
		
		if (intersections < 150) {
			System.out.print("1");
		}
		else if (streets>500 && intersections > 1000) { // streets ifadesi boolean sonu� verebilecek bir kar��la�t�rma yap�l�rsa kod derlenir.
				System.out.print("2");
		} 
		
		// ba�ka bir if-else
		if (streets < 500)
			System.out.print("1");
		else         
			System.out.print("2");
	}

}

