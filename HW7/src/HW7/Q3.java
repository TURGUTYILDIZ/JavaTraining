package HW7;

public class Q3 {
	
	public void playMusic() { // farklý parametreler kullanýlsaydý kod derlenirdi.
		System.out.print("Play!");
	}   
	private static int playMusic(int a) { // int dönüþ tipide olduðundan return ifadesi bulunmalýdýr.
		System.out.print("Music!");
		return a;
	}
		 
	public static void main(String[] tracks) {
		new Q3().playMusic();
	}

}
