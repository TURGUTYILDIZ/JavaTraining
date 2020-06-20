package HW10;

public class Q8 {
	
	public static void main(String...strings) {
		
		StringBuilder builder = new StringBuilder("Leaves growing");
		do {
			builder.delete(0, 5);	// her döngüde 5 eleman silinir.
		} while (builder.length() > 5); // uzunluk 5 ten büyük olduðunda döngü tekrar döner.
		
		System.out.println(builder);

		
	}

}
