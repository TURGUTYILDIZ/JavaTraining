package HW4;

import java.util.*;

public class Q50 {
	
	 public static void main(String[] args) {
		 
		   Arrays.sort(args);
		  // String result = Arrays.binarySearch(args, args[0]); // int d�n��� yapan aramay� string bir ifadeye atamaya �al���lm��t�r.
		  //System.out.println(result);
		   
		   int result = Arrays.binarySearch(args, args[0]); // int bir de�er girilirse kod derlenir fakat bu seferde
		   System.out.println(result);						//ArrayIndexOutOfBoundsException hatas� verecektir.
		   
	} 

}



	  
