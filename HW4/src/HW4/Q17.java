package HW4;

import java.util.Arrays;

public class Q17 {
	
	public static void main(String...strings ) {
		
		String[] os = new String[] { "Mac", "Linux", "Windows" }; 
		Arrays.sort(os); 
		System.out.println(Arrays.binarySearch(os, "Mac")); // arama yap�lmadan �nce s�ralama yap�lmas� daha sa�l�kl� olacakt�r.
		// ilk eleman arand��� i�in sonu� 1 olarak d�necektir.
		
	}
	

}
