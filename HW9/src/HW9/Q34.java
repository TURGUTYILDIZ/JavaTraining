package HW9;

import java.util.function.Predicate;

public class Q34 {
	
	public static void main(String...strings) {
		
		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink")); // "clear" ile "pink" karþýlaþtýrýlýyor.
		
	}

}
