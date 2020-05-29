package HW7;

public class Q21_ext extends Q21 {
	
	 public static String material = "cellulose";
	 public Q21_ext() {super();}
	 public String getMaterial() {return super.material;}  // extends edildiði classýn deðiþkeni çaðýrýlýr.
	 public static void main(String[] pages) {
		 System.out.print(new Q21_ext().getMaterial()); // super ile eriþiþdiðinden extend edilen classs çaðýrýlýr.
	 }

}
