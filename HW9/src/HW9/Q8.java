package HW9;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
	
	public static void main(String...strings) {
		
		List<String> museums = new ArrayList<>(1);
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");
		museums.remove(2);  // "Art" silinir . 3. eleman "Art" týr.
		System.out.println(museums);
		
	}

}
