package HW2;

public class Q50 {
	
	public Q50() {				// �nce constructor �al���r.
		System.out.print("a");
		}   
	
	public void Q50() {
		System.out.print("b");
	}
	
	public void run() {			//2. olarak bu metod �a��r�lm�� 
		new Q50();		// yeni bir nesne olu�turularak 2. kez constructor �a��r�l�r.
		Q50();			// Q50() metodu �a��r�l�r.
	}   
	
	public static void main(String... args) {
		new Q50().run();
		
		//�IKTI =  aab
		
	}

}
