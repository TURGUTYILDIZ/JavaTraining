package HW10;

public class Q64 {
	
	 static String shoe1 = new String("sandal");
	 static String shoe2 = new String("flip flop");
	 
	   public static void shopping() {
		   
		   String shoe3 = new String("croc");
		   shoe2 = shoe1;
		   shoe1 = shoe3;
		   
	   } 
	   
	   
	   public static void main(String... args) {
		   
		   shopping();
		   
	   }

}
