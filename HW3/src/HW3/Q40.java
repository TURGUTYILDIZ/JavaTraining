package HW3;

public class Q40 {
	
	public static void main(String[] arguments) {
		
		int turtle = 10 * (2 + (3 + 2) / 5); // [10 * 2 + (5/5)] = 30		
		int hare = turtle < 5 ? 10 : 25; 	 // 25
		
		System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!"); // 30 < 25 ? false döner.
	}

}

