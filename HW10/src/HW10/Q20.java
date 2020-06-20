package HW10;

public class Q20 {
	
	public static void main(String...strings) {
		
		int result = 8;
		loop: while (result > 7) {
			result++;
			do {
				result--;
				} while (result > 5);  //5 olduðunda döngüden çýkar.
			break loop;
	
		}
		System.out.println(result);

		
		
	}

}
