package HW2;

public class Q43 {

	public void play() {
		System.out.print("play-");
	}   
	
	public void finalizer() { 	// finalize() metodu ile kar��t�r�lmamal�d�r.
			System.out.print("clean-");
	}  
	
	public static void main(String[] fun) {
		Q43 car = new Q43();
		car.play();
		System.gc();
		
		car.finalizer(); // finalizer() kullan�c� taraf�ndan olu�turulmu� bir metoddur.
		
		Q43 doll = new Q43();
		doll.play();
		
	}
				
}
