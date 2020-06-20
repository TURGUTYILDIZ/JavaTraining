package HW10;

public class Q10 {
	
	 public static void main(String[] args) {
		 
		 String lol = "lol";
		 System.out.println(lol.toUpperCase() == lol); // LOL lol ' e eþit deðil     false
		 System.out.println(lol.toUpperCase() == lol.toUpperCase()); // adres farklý    false
		 System.out.println(lol.toUpperCase().equals(lol));	// LOL deðeri lol deðiþ    false
		 System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));// LOL deðeri LOL   true
		 System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));// eþit deðil     	true
		 System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));// true
		 
	 } 

}
