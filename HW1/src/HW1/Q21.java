package HW1;

public class Q21 {

	private static int yesterday = 1;	// static de�i�ken oldu�undan hem nesne ile hemde do�rudan main() metodunda kullan�labilir.
	int tomorrow = 10;					// static de�i�ken olmad���ndan sadece Q21'e ait nesne olu�turularak main() metodunda kullan�labilir.
	
	public static void main(String[] args) {
		Q21 tolls = new Q21();
		int today=20, tomorrow = 40;	// yerel de�i�ken oldu�undan do�rudan kullan�labilir.
		
		System.out.print(today + tolls.tomorrow + tolls.yesterday);
		// CEVAP : 31
		
		}	
	
}


