package HW5;

public class Q16 {
	
	private static int count;
	private static String[] stops = new String[] { "Washington",
			"Monroe", "Jackson", "LaSalle" };
	
	public static void main(String[] args) {
		
		while (count < stops.length) {
			if (stops[count++].length() < 8) { // stap elemanlarýndan uzunluðu 8 den küçük olmasý durumunda döngü kýrýlýr.
				break;   					//  döngünün 2. adýmýnda "break" ifadesi çalýþýr.
				}
			
			}
		
		System.out.println(count); // döngü 2 kere çalýþtýðý için count = 2 olur.
		
		}
	
}



