package HW5;

public class Q16 {
	
	private static int count;
	private static String[] stops = new String[] { "Washington",
			"Monroe", "Jackson", "LaSalle" };
	
	public static void main(String[] args) {
		
		while (count < stops.length) {
			if (stops[count++].length() < 8) { // stap elemanlar�ndan uzunlu�u 8 den k���k olmas� durumunda d�ng� k�r�l�r.
				break;   					//  d�ng�n�n 2. ad�m�nda "break" ifadesi �al���r.
				}
			
			}
		
		System.out.println(count); // d�ng� 2 kere �al��t��� i�in count = 2 olur.
		
		}
	
}



