package HW10;

public class Q68 {
	
	 public static void seasons(String... names) {
		 
		 int l = names[1].length();       // s1
		 System.out.println(names[l]);    // s2   bu satýrda eriþim dýþýnda bir elemana eriþilmek isteniyir     dizi dýþý?
		 
	 } 

	   public static void main(String[] args) {
		   
		   seasons("Summer", "Fall", "Winter", "Spring");
		   
	   }

}
