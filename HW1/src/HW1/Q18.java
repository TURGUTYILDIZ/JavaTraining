package HW1;

public class Q18 {

	public static void main(String[] args) {
		
	String tree = "pine";
	int count = 0;
	
	// Bu �rnekte bize local de�i�kenlerin ya�am k�s�tlamalar�n� g�stermektedir.
	// if i�inde olu�turulan de�i�ken if blo�u d���na ��k�ld���nda eri�ilemez.
	// 2 farkl� y�ntemle sonu� bulunabilir. 
	// 1.) Yazd�rma i�lemi if i�inde yap�labilir 
	// 2.) height de�i�keni if blo�unun d���nda tan�mlanabilir.
	
	if (tree.equals("pine")) {
		int height = 55;
		count = count + 1;
		
		System.out.print(height + count); // E�er kullan�m� burada olsayd� �al���r ve sonu� : 56 olurdu.
		
	} 
	
	//System.out.print(height + count);	// height local de�i�keni if blo�unun i�inde ya�ad���ndan hata verir.
	
	// CEVAP : derlenmez olacak.
	
	}
	
}



