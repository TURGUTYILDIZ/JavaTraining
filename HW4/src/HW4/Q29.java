package HW4;

import java.util.Arrays;

public class Q29 {
	
	public static void main(String...strings) {
		
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os); // arama yapmadan önce sýralama yapýlmýþtýr. aramanýn daha saðlýklý olmasýný saðlar.
		System.out.println(Arrays.binarySearch(os, "RedHat")); // Sýralama yapýldýðýnda 2. eleman olacaktý sonuç raporunda verilen bilgiler doðrultusunda -3 dönecektir.
		
	}

}



