package HW4;

import java.util.Arrays;

public class Q17 {
	
	public static void main(String...strings ) {
		
		String[] os = new String[] { "Mac", "Linux", "Windows" }; 
		Arrays.sort(os); 
		System.out.println(Arrays.binarySearch(os, "Mac")); // arama yapýlmadan önce sýralama yapýlmasý daha saðlýklý olacaktýr.
		// ilk eleman arandýðý için sonuç 1 olarak dönecektir.
		
	}
	

}
