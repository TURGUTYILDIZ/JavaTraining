package HW3;

public class Q12 {
	
	public static void main(String[] info) {
		
		int flair = 15;
	
		if(flair >= 15 && flair < 37) { // buraya girecektir.
			System.out.print("Not enough");
		} 
		// ayr� bir "if-else" blo�udur.
		if(flair==37) { // flair = 15 olud�undan else blo�una giri� yap�l�r.
			System.out.print("Just right");
		} 
		else {
			System.out.print("Too many");
		}
		
	}

}
