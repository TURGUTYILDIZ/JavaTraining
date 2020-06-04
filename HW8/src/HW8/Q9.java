package HW8;

public class Q9 {
	
	 public static void main(String officials[]) {
		 
		 try {
			 System.out.print('A');
			 throw new RuntimeException("Out of bounds!");
			 }
		 catch (ArrayIndexOutOfBoundsException aioobe) {
			 System.out.print('B');
			 
			 //throw t; // t referansýnýn refere ettiði bir hata veya deðiþken olmadýðýndan hata verecektir.
			 
			 throw aioobe; // kodun derlenmesi için "aioobe" referansý verilmelidir.
			 // eðer kodun derlenmesini saðlasaydýk;
			 // ACException in thread "main" java.lang.RuntimeException: Out of bounds! 
			 // þeklinde bir hata uyarýsý alacaktýk.
			 }
		 finally {
			 System.out.print('C');
			 }
		 
	 } 

}
