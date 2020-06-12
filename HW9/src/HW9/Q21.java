package HW9;

import java.util.Arrays;
import java.util.List;

public class Q21 {
	
	public static void main(String...strings) {
		
		String[] array = {"Natural History", "Science"};
		List<String> museums = Arrays.asList(array);
		museums.set(0, "Art"); // 1. eleman art oluyor.
		System.out.println(museums.contains("Art")); // true döner bir üst adýmda Art eklenir.
		
	}

}
