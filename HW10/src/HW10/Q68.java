package HW10;

public class Q68 {
	
	 public static void seasons(String... names) {
		 
		 int l = names[1].length();       // s1
		 System.out.println(names[l]);    // s2   bu sat�rda eri�im d���nda bir elemana eri�ilmek isteniyir     dizi d���?
		 
	 } 

	   public static void main(String[] args) {
		   
		   seasons("Summer", "Fall", "Winter", "Spring");
		   
	   }

}
