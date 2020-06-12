package HW9;

import java.time.LocalDate;

public class Q32 {
	
	public static void main(String...strings) {
		
		LocalDate xmas = LocalDate.of(2016,  12,  25);
		xmas.plusDays(-1);
		System.out.println(xmas.getDayOfMonth()); // ayýn kaçýncý günü olduðu çýkar.
		
	}

}
