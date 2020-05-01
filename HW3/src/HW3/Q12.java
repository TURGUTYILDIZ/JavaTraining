package HW3;

public class Q12 {
	
	public static void main(String[] info) {
		
		int flair = 15;
	
		if(flair >= 15 && flair < 37) { // buraya girecektir.
			System.out.print("Not enough");
		} 
		// ayrı bir "if-else" bloğudur.
		if(flair==37) { // flair = 15 oludğundan else bloğuna giriş yapılır.
			System.out.print("Just right");
		} 
		else {
			System.out.print("Too many");
		}
		
	}

}

