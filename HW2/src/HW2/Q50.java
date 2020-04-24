package HW2;

public class Q50 {
	
	public Q50() {				// önce constructor çalýþýr.
		System.out.print("a");
		}   
	
	public void Q50() {
		System.out.print("b");
	}
	
	public void run() {			//2. olarak bu metod çaðýrýlmýþ 
		new Q50();		// yeni bir nesne oluþturularak 2. kez constructor çaðýrýlýr.
		Q50();			// Q50() metodu çaðýrýlýr.
	}   
	
	public static void main(String... args) {
		new Q50().run();
		
		//ÇIKTI =  aab
		
	}

}
