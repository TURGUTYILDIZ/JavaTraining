package HW5;

import java.util.ArrayList;
import java.util.List;

public class Q30 {
	
	public static void main(String...strings) {
		
		int count = 10;
		List<Character> chars = new ArrayList<>();
		
		do {  
			chars.add('a');
			for (Character x : chars) count -=1; // chars i�indeki eleman kadar d�ng� d�ner ve count eleman say�s� kadar azal�r.
			} while (count > 0);
		
		System.out.println(chars.size());
		
	}


}
