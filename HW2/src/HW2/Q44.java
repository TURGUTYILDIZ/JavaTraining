package HW2;

public class Q44 {

	private double beakLength;
	
	public static void setBeakLength(Q44 p, int b) {
		p.beakLength = b; 	//	de�i�kene d��ar�dan de�er atamas� ger�ekle�tirilir.
	} 
	   
	public static void main(String... args) {
		
		Q44 q44 = new Q44();
		
		q44.setBeakLength(q44, 10); // nesnenin metodu kullan�ld�.
		
		System.out.println(q44.beakLength);
	}

}

 
	   