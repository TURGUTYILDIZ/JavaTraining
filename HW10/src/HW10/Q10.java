package HW10;

public class Q10 {
	
	 public static void main(String[] args) {
		 
		 String lol = "lol";
		 System.out.println(lol.toUpperCase() == lol); // LOL lol ' e e�it de�il     false
		 System.out.println(lol.toUpperCase() == lol.toUpperCase()); // adres farkl�    false
		 System.out.println(lol.toUpperCase().equals(lol));	// LOL de�eri lol de�i�    false
		 System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));// LOL de�eri LOL   true
		 System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));// e�it de�il     	true
		 System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));// true
		 
	 } 

}
