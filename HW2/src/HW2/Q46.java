package HW2;

public class Q46 {
	
	public Q46 youngestChild; // class türünden bir deðiþken.

	public static void main(String... args) {
		
		Q46 elena = new Q46(); 			// elena oluþturdu
		Q46 diana = new Q46();			// diana oluþturuldu.
		elena.youngestChild = diana;	// dianaya elena üzerinden ulaþýlabilir.
		diana = null;					// diana "null" edildi.
		Q46 zoe = new Q46();			// zoe oluþturuldu.
		elena.youngestChild = zoe;		// elana dianayý tutyordu þimdi zoe yi tutuyor
										// diana kullanýlmadýðýndan garbage collector silebilir.
		zoe = null;
		
		}

}




