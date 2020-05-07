package HW4;

import java.util.*;

public class Q50 {
	
	 public static void main(String[] args) {
		 
		   Arrays.sort(args);
		  // String result = Arrays.binarySearch(args, args[0]); // int dönüþü yapan aramayý string bir ifadeye atamaya çalýþýlmýþtýr.
		  //System.out.println(result);
		   
		   int result = Arrays.binarySearch(args, args[0]); // int bir deðer girilirse kod derlenir fakat bu seferde
		   System.out.println(result);						//ArrayIndexOutOfBoundsException hatasý verecektir.
		   
	} 

}



	  
