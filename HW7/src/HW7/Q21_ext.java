package HW7;

public class Q21_ext extends Q21 {
	
	 public static String material = "cellulose";
	 public Q21_ext() {super();}
	 public String getMaterial() {return super.material;}  // extends edildi�i class�n de�i�keni �a��r�l�r.
	 public static void main(String[] pages) {
		 System.out.print(new Q21_ext().getMaterial()); // super ile eri�i�di�inden extend edilen classs �a��r�l�r.
	 }

}
