package HW3;

public class Q25 {
	
	public static String travel(int distance) {
		
		return distance<1000 ? "train" : "10"; // dönüþ yapýlacak 2 ifadede ayný türden olmalýdýr.
	}   
	
	public static void main(String[] answer) {
		
		System.out.print(travel(500));
	}

}
