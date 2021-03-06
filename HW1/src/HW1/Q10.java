package HW1;

public class Q10 {
	
	static String weight = "A lot";
	/* default */ double ageMonths = 5, ageDays = 2;
	private static boolean success = true;
	
	public static void main(String[] args) { // Java main() metodtan çalışmaya başladığından burası static olmalıdır.  
		
		final String retries = "1"; // yerel değişken
		// P1
		
		System.out.println(weight);		// static değişkenlere doğrudan erişilebilir

		Q10 q10 = new Q10(); // static olmayan değişkenleri oluşturulan nesne üzerinde çağırabiliriz.
		
		System.out.println(q10.ageMonths); // değişkeni nesne üzerinden istediğimiz yerde çağırabiliriz.
		
		System.out.println(q10.ageDays); // değişkeni nesne üzerinden istediğimiz yerde çağırabiliriz.

		System.out.println(success);	// static değişkenlere doğrudan erişilebilir
		
		System.out.println(retries);	// yerel değişken
		
	}
	
	
	
	public void mainOriginal(String[] args) {// Notice in this question that main() is not a static method.
		
		final String retries = "1";


		System.out.println(weight);// mainOriginal() metodu static olmadığından direk Q10 classının değişkenini çekebilir.								

		System.out.println(ageMonths);// mainOriginal() metodu static olmadığından direk Q10 classının değişkenini çekebilir.
										
		System.out.println(ageDays);// mainOriginal() metodu static olmadığından direk Q10 classının değişkenini çekebilir.
		
		System.out.println(success);// mainOriginal() metodu static olmadığından direk Q10 classının değişkenini çekebilir.
			
		System.out.println(retries); //mainOriginal() metodunun yerel değişkenidir.
		// Cevap: 2,2,1
				
	}
	
}

