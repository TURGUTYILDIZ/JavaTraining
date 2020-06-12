package HW9;

import java.util.ArrayList;
import java.util.List;

public class Q23 {
	
	public static void main(String...strings) {
		
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');
		chars.remove(0);
		System.out.print(chars.size());  // ArrayList boyut size() metodu ile öðrenilir.
		
	}

}
