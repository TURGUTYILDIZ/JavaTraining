package HW7;

public class Q18_pubabstract extends Q18{ // g2   // abstract olursa soyutla�t�r�l�r bundan dolay� derlenmeyecektir.

		public String getDescription() { return "irt"; }
		
		public static void main(String[] edges) {
			final Q18 shape = new Q18_pubabstract(); // g3  // soyut s�n�f somutla�t�r�ld���ndan derlenmeyecektir.    
			System.out.print(shape.getDescription());
		}
	

}
