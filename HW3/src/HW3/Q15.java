package HW3;

public class Q15 {
	
	public static void main(String...strings) {
	
		int hops = 0;
		int jumps = 0;
		jumps = hops++;	// jumps = 0      hops = 0
						// jumps = 0      hops = 1
		
		if(jumps) // integer de�er oldu�undan de�erlendirilmez... boolean de�er olmal�d�r.
			System.out.print("Jump!");
		else   System.out.print("Hop!");

	}
	
}
