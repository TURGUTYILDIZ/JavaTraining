package HW10;

public class Q8 {
	
	public static void main(String...strings) {
		
		StringBuilder builder = new StringBuilder("Leaves growing");
		do {
			builder.delete(0, 5);	// her d�ng�de 5 eleman silinir.
		} while (builder.length() > 5); // uzunluk 5 ten b�y�k oldu�unda d�ng� tekrar d�ner.
		
		System.out.println(builder);

		
	}

}
