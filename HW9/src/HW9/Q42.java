package HW9;

import java.util.ArrayList;
import java.util.List;

public class Q42 {
	
	public static void main(String...strings) {
		
		List<Integer> pennies = new ArrayList<>();
		pennies.add(3);
		pennies.add(2);
		pennies.add(1);
		pennies.remove(2); // 3. eleman siliniyor.
		System.out.println(pennies);
		
	}

}
