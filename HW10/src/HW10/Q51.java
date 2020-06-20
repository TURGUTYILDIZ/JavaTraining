package HW10;

import java.util.Arrays;
import java.util.List;

public class Q51 {
	
	public static void main(String...strings) {
		
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = drinks.size(); container > 0; container++) {
			System.out.print(drinks.get(container-1) + ","); // eriþim olmayan dizinin dýþýna eriþiliyor.
			
		}
		
	}


}
