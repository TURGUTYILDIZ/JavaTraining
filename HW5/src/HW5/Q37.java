package HW5;

public class Q37 {
	
	public static void main(String...strings) {
		
	  String race = "";
	  loop:
		  do {
			  race += "x";
			  break loop; // loop d�ng�s� while i�ine girmeden ��kacak ve de�eri "x" olacakt�r.
			  } while (true); 
	  
	   System.out.println(race);

		
	}

}
