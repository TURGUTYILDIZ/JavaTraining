package HW9;

import java.util.function.Predicate;

public class Q28 {
	
	public static void main(String...strings) {
		
		Predicate dash = c -> ((String) c).startsWith("-");  // Predicate classý ile startsWith() metodu ayný objeden olmadýðýndan eþitlemek için cast edilmelidir.
		System.out.println(dash.test("–"));

		
	}

}
