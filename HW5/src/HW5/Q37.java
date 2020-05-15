package HW5;

public class Q37 {
	
	public static void main(String...strings) {
		
	  String race = "";
	  loop:
		  do {
			  race += "x";
			  break loop; // loop döngüsü while içine girmeden çýkacak ve deðeri "x" olacaktýr.
			  } while (true); 
	  
	   System.out.println(race);

		
	}

}
