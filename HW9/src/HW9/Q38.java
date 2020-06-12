package HW9;

import java.time.*;
import java.time.format.*;

public class Q38 {
	
	public static void main(String[] args) {
		
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		Period period = Period.ofDays(1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy"); // format deðiþti.
		System.out.print(format.format(newYears.minus(period))); // 1 deðer düþürülüp ekrana çýkarýldý.
		
	}
	
}
