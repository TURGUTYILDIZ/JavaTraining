package HW6;

public class Q32 {
	
	 private int inThe = 4;
	 
	 //public void Q32() { // void olan bir metod() kurucu yapýlmýþ ve süper() metodu çaðýlmaya çalýþýlmýþ yanlýþtýr.
	 public Q32() {
		 super();
	 }
	 
	 public Q32(int inThe) {
		 this.inThe = this.inThe;
	 }
	 
	 public static void main(String[] endless) {
		 System.out.print(new HW6.Q32(2).inThe);
	 } 

}
