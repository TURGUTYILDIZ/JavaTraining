package HW5;

public class Q28 {
	
	public static void main(String...strings ) {
		
		String letters = "";
		
		while (letters.length() != 3) // hi� bir zaman sa�lanmayacakt�r. sonsuz d�ng�ye girecektir.
			letters+="ab";
		
		System.out.println(letters);

		
	}

}
