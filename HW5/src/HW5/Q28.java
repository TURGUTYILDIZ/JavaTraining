package HW5;

public class Q28 {
	
	public static void main(String...strings ) {
		
		String letters = "";
		
		while (letters.length() != 3) // hiç bir zaman saðlanmayacaktýr. sonsuz döngüye girecektir.
			letters+="ab";
		
		System.out.println(letters);

		
	}

}
