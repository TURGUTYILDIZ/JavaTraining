package HW3;

public class Q25 {
	
	public static String travel(int distance) {
		
		return distance<1000 ? "train" : "10"; // d�n�� yap�lacak 2 ifadede ayn� t�rden olmal�d�r.
	}   
	
	public static void main(String[] answer) {
		
		System.out.print(travel(500));
	}

}
