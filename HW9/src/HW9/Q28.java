package HW9;

import java.util.function.Predicate;

public class Q28 {
	
	public static void main(String...strings) {
		
		Predicate dash = c -> ((String) c).startsWith("-");  // Predicate class� ile startsWith() metodu ayn� objeden olmad���ndan e�itlemek i�in cast edilmelidir.
		System.out.println(dash.test("�"));

		
	}

}
