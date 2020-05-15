package HW5;

import java.util.ArrayList;
import java.util.List;

public class Q30 {
	
	public static void main(String...strings) {
		
		int count = 10;
		List<Character> chars = new ArrayList<>();
		
		do {  
			chars.add('a');
			for (Character x : chars) count -=1; // chars içindeki eleman kadar döngü döner ve count eleman sayýsý kadar azalýr.
			} while (count > 0);
		
		System.out.println(chars.size());
		
	}


}
