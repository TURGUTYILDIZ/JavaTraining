package HW3;

public class Q50 {
	
	public static String play(int toy, int age) {
		
		final String game;
		if(toy<2) {
			//game = age > 1 ? 1 : 10; // p1    game String t�r�nde oldu�undan derlenmeyecekti.
			game = age > 1 ? "1" : "10";
		}
		else          
			game = age > 3 ? "Ball" : "Swim"; // p2
				
		return game;
			
	} 
	
	public static void main(String[] variables) {
		
		System.out.print(play(5,2));
	}

}


