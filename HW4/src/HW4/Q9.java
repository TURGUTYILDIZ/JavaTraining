package HW4;

import java.util.Arrays;

public class Q9 {

	public static void main(String...strings ) {
	
	int dizi[] = new int[] { 4 , 35 , 534 , 32 , 3 , 2, 156 };
	
	// binarysearch dizide s�ral� say�larda arama yapabilir e�er dizi artan s�rada de�ilse (-) de�er d�nd�r�r.
    int aranan = Arrays.binarySearch ( dizi , 2 );
    int aranan2 = Arrays.binarySearch ( dizi , 4 );
    int aranan3 = Arrays.binarySearch ( dizi , 35 );
    int aranan4 = Arrays.binarySearch ( dizi , 32324 );
    System.out.println ( aranan );
    System.out.println ( aranan2 );
    System.out.println ( aranan3 );
    System.out.println ( aranan4 );

    // Arrays.sort ile dizi siralanir
    Arrays.sort ( dizi );

    // Dizi s�ralan�r ve eleman�n bulundu�u indis d�nd�r�l�r.
    aranan = Arrays.binarySearch ( dizi , 3 );
    aranan2 = Arrays.binarySearch ( dizi , 4 );
    aranan3 = Arrays.binarySearch ( dizi , 35 );
    System.out.println ( aranan );
    System.out.println ( aranan2 );
    System.out.println ( aranan3 );
    
	}
	
}
