package HW2;

public class Q46 {
	
	public Q46 youngestChild; // class t�r�nden bir de�i�ken.

	public static void main(String... args) {
		
		Q46 elena = new Q46(); 			// elena olu�turdu
		Q46 diana = new Q46();			// diana olu�turuldu.
		elena.youngestChild = diana;	// dianaya elena �zerinden ula��labilir.
		diana = null;					// diana "null" edildi.
		Q46 zoe = new Q46();			// zoe olu�turuldu.
		elena.youngestChild = zoe;		// elana dianay� tutyordu �imdi zoe yi tutuyor
										// diana kullan�lmad���ndan garbage collector silebilir.
		zoe = null;
		
		}

}




