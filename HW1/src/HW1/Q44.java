package HW1;

public class Q44 {

	static private boolean numLock = true;  // static ifadesi eklendiğinde derlenecek hale getirilmiştir.
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		System.out.print(numLock+" "+capLock);
		//numLock ifadesine static olmadan veya bir nesne oluşturulmadan erişilemez.
		//bu hali ile derlendiğinde "true false" ekrana çıkar.
		//CEVAP : derlenemez olmalıdır.
		
		}
	
}

