package HW2;

public class Q43 {

	public void play() {
		System.out.print("play-");
	}   
	
	public void finalizer() { 	// finalize() metodu ile karýþtýrýlmamalýdýr.
			System.out.print("clean-");
	}  
	
	public static void main(String[] fun) {
		Q43 car = new Q43();
		car.play();
		System.gc();
		
		car.finalizer(); // finalizer() kullanýcý tarafýndan oluþturulmuþ bir metoddur.
		
		Q43 doll = new Q43();
		doll.play();
		
	}
				
}
