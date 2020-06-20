package HW10;

public class Q9 {
	
	 public static void main(String[] edges) {
		 final String ceiling = "up";
		 String floor = new String("up");
		 final String wall = new String(floor);
		 
		 System.out.print((ceiling==wall)//farklý adressler
			 +" "+(floor==wall)			// farklý adress
			 +" "+ceiling.equals(wall)); // deðeri wall'dýr.
	 } 

}
