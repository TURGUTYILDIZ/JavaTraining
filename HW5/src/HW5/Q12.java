package HW5;

import java.util.Arrays;
import java.util.List;

public class Q12 {

	public static void main(String... strings) {
		
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = drinks.size() - 1; container >= 0; container--)  // son elemandan ilk elemana kadar döngü saðlanýr.
			System.out.print(drinks.get(container) + ",");
		
	}
	
}


