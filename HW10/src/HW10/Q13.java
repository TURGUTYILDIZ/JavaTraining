package HW10;

import java.time.*;

public class Q13 {

	 public static void main(String... nums) {
		 
		 LocalTime time = LocalTime.of(1, 11);
		 while (time.getHour() < 1) { // saat 1 den küçük deðil  döngüye girilmeyecektir.
		 time.plusHours(1);
		 System.out.println("in loop");
		 
		 }
	 }
	
}
