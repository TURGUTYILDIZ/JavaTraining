package HW1;

public class Q44 {

	static private boolean numLock = true;  // static ifadesi eklendiðinde derlenecek hale getirilmiþtir.
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		System.out.print(numLock+" "+capLock);
		//numLock ifadesine static olmadan veya bir nesne oluþturulmadan eriþilemez.
		//bu hali ile derlendiðinde "true false" ekrana çýkar.
		//CEVAP : derlenemez olmalýdýr.
		
		}
	
}

