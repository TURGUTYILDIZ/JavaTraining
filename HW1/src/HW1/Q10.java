package HW1;

public class Q10 {
	
	static String weight = "A lot";
	/* default */ double ageMonths = 5, ageDays = 2;
	private static boolean success = true;
	
	public static void main(String[] args) { // Java main() metodtan çalýþmaya baþladýðýndan burasý static olmalýdýr.  
		
		final String retries = "1"; // yerel deðiþken
		// P1
		
		System.out.println(weight);		// static deðiþkenlere doðrudan eriþilebilir

		Q10 q10 = new Q10(); // static olmayan deðiþkenleri oluþturulan nesne üzerinde çaðýrabiliriz.
		
		System.out.println(q10.ageMonths); // deðiþkeni nesne üzerinden istediðimiz yerde çaðýrabiliriz.
		
		System.out.println(q10.ageDays); // deðiþkeni nesne üzerinden istediðimiz yerde çaðýrabiliriz.

		System.out.println(success);	// static deðiþkenlere doðrudan eriþilebilir
		
		System.out.println(retries);	// yerel deðiþken
		
	}
	
	
	
	public void mainOriginal(String[] args) {// Notice in this question that main() is not a static method.
		
		final String retries = "1";


		System.out.println(weight);// mainOriginal() metodu static olmadýðýndan direk Q10 classýnýn deðiþkenini çekebilir.								

		System.out.println(ageMonths);// mainOriginal() metodu static olmadýðýndan direk Q10 classýnýn deðiþkenini çekebilir.
										
		System.out.println(ageDays);// mainOriginal() metodu static olmadýðýndan direk Q10 classýnýn deðiþkenini çekebilir.
		
		System.out.println(success);// mainOriginal() metodu static olmadýðýndan direk Q10 classýnýn deðiþkenini çekebilir.
			
		System.out.println(retries); //mainOriginal() metodunun yerel deðiþkenidir.
		// Cevap: 2,2,1
				
	}
	
}

