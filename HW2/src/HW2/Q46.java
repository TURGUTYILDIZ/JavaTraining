package HW2;

public class Q46 {
	
	public Q46 youngestChild; // class türünden bir değişken.

	public static void main(String... args) {
		
		Q46 elena = new Q46(); 			// elena oluşturdu
		Q46 diana = new Q46();			// diana oluşturuldu.
		elena.youngestChild = diana;	// dianaya elena üzerinden ulaşılabilir.
		diana = null;					// diana "null" edildi.
		Q46 zoe = new Q46();			// zoe oluşturuldu.
		elena.youngestChild = zoe;		// elana dianayı tutyordu şimdi zoe yi tutuyor
										// diana kullanılmadığından garbage collector silebilir.
		zoe = null;
		
		}

}




