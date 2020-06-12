package HW9;

import java.util.ArrayList;

public class Q12 {
	
	public static void secret( ArrayList<String> mystery) {
		mystery.add("metal");
		String str = mystery.get(0);
		int num = ((CharSequence) mystery).length();  // ayrýca burayada CharSequence eklenmelidir. inte çevirim olduðundan.
	}
	
	public static void main(String... string) {
	

		
	}

}
