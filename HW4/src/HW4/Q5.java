package HW4;

import java.util.Arrays;

public class Q5 {
	
	public static void printStormName(String... names) { // varargs ifadesi ile oluþturulmuþtur.
		
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);
	} 
	
	public static void printStormNames(String[] names) {
		
		System.out.println(Arrays.toString(names));
	}
	
	public static void main(String...strings) {
		
		printStormName("Arlene");
		printStormName(new String[] { "Bret" });
		//printStormNames("Cindy"); 			// varargs ifadesi ile oluþturulmadýðýndan diziye atanmayacaktýr.
		printStormNames(new String[] { "Don" });
		
		

		
	}
}



