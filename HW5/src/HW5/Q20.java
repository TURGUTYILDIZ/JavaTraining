package HW5;

import java.util.Arrays;
import java.util.List;

public class Q20 {
	
	public static void main(String...strings) {

	List<String> drinks = Arrays.asList("can", "cup");
	
	for (int container = 0; container < drinks.size(); container++)
		System.out.print(drinks.get(container) + ",");

	}
	
}
