package HW1;

public class Q18 {

	public static void main(String[] args) {
		
	String tree = "pine";
	int count = 0;
	
	// Bu örnekte bize local deðiþkenlerin yaþam kýsýtlamalarýný göstermektedir.
	// if içinde oluþturulan deðiþken if bloðu dýþýna çýkýldýðýnda eriþilemez.
	// 2 farklý yöntemle sonuç bulunabilir. 
	// 1.) Yazdýrma iþlemi if içinde yapýlabilir 
	// 2.) height deðiþkeni if bloðunun dýþýnda tanýmlanabilir.
	
	if (tree.equals("pine")) {
		int height = 55;
		count = count + 1;
		
		System.out.print(height + count); // Eðer kullanýmý burada olsaydý çalýþýr ve sonuç : 56 olurdu.
		
	} 
	
	//System.out.print(height + count);	// height local deðiþkeni if bloðunun içinde yaþadýðýndan hata verir.
	
	// CEVAP : derlenmez olacak.
	
	}
	
}



