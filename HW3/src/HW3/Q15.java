package HW3;

public class Q15 {
	
	public static void main(String...strings) {
	
		int hops = 0;
		int jumps = 0;
		jumps = hops++;	// jumps = 0      hops = 0
						// jumps = 0      hops = 1
		
		if(jumps) // integer deðer olduðundan deðerlendirilmez... boolean deðer olmalýdýr.
			System.out.print("Jump!");
		else   System.out.print("Hop!");

	}
	
}
