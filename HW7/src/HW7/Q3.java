package HW7;

public class Q3 {
	
	public void playMusic() { // farkl� parametreler kullan�lsayd� kod derlenirdi.
		System.out.print("Play!");
	}   
	private static int playMusic(int a) { // int d�n�� tipide oldu�undan return ifadesi bulunmal�d�r.
		System.out.print("Music!");
		return a;
	}
		 
	public static void main(String[] tracks) {
		new Q3().playMusic();
	}

}
