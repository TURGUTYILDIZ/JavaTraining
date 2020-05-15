package HW5;

import java.util.*;

public class Q43 {
	
	  public static void main(String[] args) {
		  List<String> exams = Arrays.asList("OCA", "OCP");
		  
		  for (String e1 : exams)
			  for (String e2 : exams)
				  System.out.println(e1 + " " + e2); // 2 faklý nene ile 2x2 kere dönecektir.
		  
	  } 

}
