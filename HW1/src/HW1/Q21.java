package HW1;

public class Q21 {

	private static int yesterday = 1;	// static değişken olduğundan hem nesne ile hemde doğrudan main() metodunda kullanılabilir.
	int tomorrow = 10;					// static değişken olmadığından sadece Q21'e ait nesne oluşturularak main() metodunda kullanılabilir.
	
	public static void main(String[] args) {
		Q21 tolls = new Q21();
		int today=20, tomorrow = 40;	// yerel değişken olduğundan doğrudan kullanılabilir.
		
		System.out.print(today + tolls.tomorrow + tolls.yesterday);
		// CEVAP : 31
		
		}	
	
}


