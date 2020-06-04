package HW8;

public class Q12 {
	
	 public static void main(String[] dribble) {
		 try { 
			 System.out.print(1);
			 throw new ClassCastException();
			 }
		 catch (ArrayIndexOutOfBoundsException ex) { // dizi sýnýrý aþlmasýndan dolayý bir hata yoktr.
			 System.out.print(2);
			 }
		 catch (Throwable ex) { // try bloðunda throw olarak hata sorgulanýyor.
			 System.out.print(3);
			 }
		 finally {
			 System.out.print(4);// try-catch bloðu sonlandýðýnda mtlaka çalýþacak bloktur.
			 }
		 System.out.print(5); // burasý zaten çalýþýr kodun devamý olduðundan main() metod gövdesindedir.
		 } 

}
