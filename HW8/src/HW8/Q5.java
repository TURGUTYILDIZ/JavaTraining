package HW8;

public class Q5 {
	
	 public static void main(String... teams) {
		 int score = 1; // bu þekilde bir deðiþken tanýmlamasý kodu çalýþr duruma getirecektir.
		 
		 try {
			 //int score = 1;   // yerel deðiþken tanýmlanýrsa catch ve finally hata verecektir. global tanýmlanmalýdýr.
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
