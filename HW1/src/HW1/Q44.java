package HW1;

public class Q44 {

	static private boolean numLock = true;  // static ifadesi eklendi�inde derlenecek hale getirilmi�tir.
	static boolean capLock = false;
	public static void main(String... shortcuts) {
		System.out.print(numLock+" "+capLock);
		//numLock ifadesine static olmadan veya bir nesne olu�turulmadan eri�ilemez.
		//bu hali ile derlendi�inde "true false" ekrana ��kar.
		//CEVAP : derlenemez olmal�d�r.
		
		}
	
}

