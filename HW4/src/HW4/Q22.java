package HW4;

public class Q22 {
	
	public static void addStationName(String[] names) {
		
		names[names.length] = "Times Square"; // Diziler tekrardan boyutland�r�lamaz.
											  // "ArrayIndexOutOfBoundsException" hatas� verecektir.
		
		}
	
	public static void main(String[] args) {
		
		String[] s = {"a"};
		
		Q22 q22 = new Q22();
		q22.addStationName(s);
	
		
	}


}
