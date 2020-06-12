package HW9;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
	
	public static void main(String...strings) {
		
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');  // b deðeri c olarak deðiþtirildi.
		chars.remove(0);  // ilk terim silindi.
		System.out.print(chars.size() + " " + chars.contains('b'));
		
	}

}
