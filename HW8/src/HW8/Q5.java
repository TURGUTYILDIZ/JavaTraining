package HW8;

public class Q5 {
	
	 public static void main(String... teams) {
		 int score = 1; // bu �ekilde bir de�i�ken tan�mlamas� kodu �al��r duruma getirecektir.
		 
		 try {
			 //int score = 1;   // yerel de�i�ken tan�mlan�rsa catch ve finally hata verecektir. global tan�mlanmal�d�r.
			 System.out.print(score++);
			 }
		 catch (Throwable t) {
			 System.out.print(++score);
			 }
		 finally {
			 System.out.print(++score);
			 }
		 System.out.print(score++);
		 } 

}
