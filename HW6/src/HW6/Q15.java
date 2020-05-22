package HW6;

public class Q15 {
	
	 private int age = 18;
	 
	 private static void slalom(Q15 racer, int[] speed, String name) {
		 
		 racer.age = 18;
		 name = "Wendy";
		 speed = new int[1];
		 speed[0] = 11;
	
		 System.out.println(racer.age); // tüm deðerler atanýr.
		 System.out.println(name);
		 System.out.println(speed[0]);
		 // fakat sonra herþey null'a eþitlenir.
		 racer = null;
     
     }   
	 
	 public static void main(String... mountain) {
		 
		 final Q15 mySkier = new Q15();
		 mySkier.age = 16;
		 final int[] mySpeed = new int[1];
		 final String myName = "Rosie";
		 slalom(mySkier,mySpeed,myName);
		 
	 } 

}
