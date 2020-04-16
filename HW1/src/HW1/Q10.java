package HW1;

public class Q10 {
	
	static String weight = "A lot";
	/* default */ double ageMonths = 5, ageDays = 2;
	private static boolean success = true;
	
	public static void main(String[] args) { // Java main() metodtan �al��maya ba�lad���ndan buras� static olmal�d�r.  
		
		final String retries = "1"; // yerel de�i�ken
		// P1
		
		System.out.println(weight);		// static de�i�kenlere do�rudan eri�ilebilir

		Q10 q10 = new Q10(); // static olmayan de�i�kenleri olu�turulan nesne �zerinde �a��rabiliriz.
		
		System.out.println(q10.ageMonths); // de�i�keni nesne �zerinden istedi�imiz yerde �a��rabiliriz.
		
		System.out.println(q10.ageDays); // de�i�keni nesne �zerinden istedi�imiz yerde �a��rabiliriz.

		System.out.println(success);	// static de�i�kenlere do�rudan eri�ilebilir
		
		System.out.println(retries);	// yerel de�i�ken
		
	}
	
	
	
	public void mainOriginal(String[] args) {// Notice in this question that main() is not a static method.
		
		final String retries = "1";


		System.out.println(weight);// mainOriginal() metodu static olmad���ndan direk Q10 class�n�n de�i�kenini �ekebilir.								

		System.out.println(ageMonths);// mainOriginal() metodu static olmad���ndan direk Q10 class�n�n de�i�kenini �ekebilir.
										
		System.out.println(ageDays);// mainOriginal() metodu static olmad���ndan direk Q10 class�n�n de�i�kenini �ekebilir.
		
		System.out.println(success);// mainOriginal() metodu static olmad���ndan direk Q10 class�n�n de�i�kenini �ekebilir.
			
		System.out.println(retries); //mainOriginal() metodunun yerel de�i�kenidir.
		// Cevap: 2,2,1
				
	}
	
}

