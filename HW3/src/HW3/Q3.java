package HW3;

public class Q3 {
	
	public static void main(String... data) {
		
		String john = "john"; 
		String jon = new String(john); // new ile yeni bir string olu�turuldu.
		
		// yeni olu�turulan string ile "==" operat�r� ile kontrol yap�ld���nda "FALSE" d�ner.
		// 2 nesnede birbirine e�itlendi�inden 2. kar��la�t�rma "TRUE" d�ner.
		System.out.print((john==jon)+" "+(john.equals(jon)));
		
	}

}

