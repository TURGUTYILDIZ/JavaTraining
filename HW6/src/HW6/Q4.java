package HW6;

public class Q4 {
	
	 public void nested() { nested(2,true); } // g1   d�n�� tipi olmad���ndan kod derlenmeyecektir.
	 
	 public int nested(int level, boolean height) { return nested(level); }
	 
	 public int nested(int level) { return level+1; }; // g2 
	 
	   public static void main(String[] outOfTheBox) {
		   
		   System.out.print(new Q4().nested()); // d�n�� tipi olmayan bir metod �a�r�lm��t�r derlenmeyecektir.
		   
	   } 

}
