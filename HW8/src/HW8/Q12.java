package HW8;

public class Q12 {
	
	 public static void main(String[] dribble) {
		 try { 
			 System.out.print(1);
			 throw new ClassCastException();
			 }
		 catch (ArrayIndexOutOfBoundsException ex) { // dizi s�n�r� a�lmas�ndan dolay� bir hata yoktr.
			 System.out.print(2);
			 }
		 catch (Throwable ex) { // try blo�unda throw olarak hata sorgulan�yor.
			 System.out.print(3);
			 }
		 finally {
			 System.out.print(4);// try-catch blo�u sonland���nda mtlaka �al��acak bloktur.
			 }
		 System.out.print(5); // buras� zaten �al���r kodun devam� oldu�undan main() metod g�vdesindedir.
		 } 

}
