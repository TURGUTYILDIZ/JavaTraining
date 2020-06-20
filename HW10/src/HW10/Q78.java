package HW10;

import java.time.*;

public class Q78 {
	
	public static void main(String...strings) {
		
		int count = 0;
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);
		
		while (date.getMonth() != Month.APRIL)
			date = date.minusMonths(1);
		
		count++;  // sadece 1 kere artar.
		System.out.println(count);

		
	}

}
