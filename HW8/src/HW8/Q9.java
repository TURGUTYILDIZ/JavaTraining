package HW8;

public class Q9 {
	
	 public static void main(String officials[]) {
		 
		 try {
			 System.out.print('A');
			 throw new RuntimeException("Out of bounds!");
			 }
		 catch (ArrayIndexOutOfBoundsException aioobe) {
			 System.out.print('B');
			 
			 //throw t; // t referans�n�n refere etti�i bir hata veya de�i�ken olmad���ndan hata verecektir.
			 
			 throw aioobe; // kodun derlenmesi i�in "aioobe" referans� verilmelidir.
			 // e�er kodun derlenmesini sa�lasayd�k;
			 // ACException in thread "main" java.lang.RuntimeException: Out of bounds! 
			 // �eklinde bir hata uyar�s� alacakt�k.
			 }
		 finally {
			 System.out.print('C');
			 }
		 
	 } 

}
