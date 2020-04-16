package HW1;

public class Q21 {

	private static int yesterday = 1;	// static deðiþken olduðundan hem nesne ile hemde doðrudan main() metodunda kullanýlabilir.
	int tomorrow = 10;					// static deðiþken olmadýðýndan sadece Q21'e ait nesne oluþturularak main() metodunda kullanýlabilir.
	
	public static void main(String[] args) {
		Q21 tolls = new Q21();
		int today=20, tomorrow = 40;	// yerel deðiþken olduðundan doðrudan kullanýlabilir.
		
		System.out.print(today + tolls.tomorrow + tolls.yesterday);
		// CEVAP : 31
		
		}	
	
}


