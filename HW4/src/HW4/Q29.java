package HW4;

import java.util.Arrays;

public class Q29 {
	
	public static void main(String...strings) {
		
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os); // arama yapmadan �nce s�ralama yap�lm��t�r. araman�n daha sa�l�kl� olmas�n� sa�lar.
		System.out.println(Arrays.binarySearch(os, "RedHat")); // S�ralama yap�ld���nda 2. eleman olacakt� sonu� raporunda verilen bilgiler do�rultusunda -3 d�necektir.
		
	}

}



