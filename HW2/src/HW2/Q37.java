package HW2;

public class Q37 {

     public String first = "instance";
     
     public Q37() {
    	 first = "constructor";
    	 }
     
     { first = "block";  }
     
     public void print() {
    	 System.out.println(first); // first degeri constructor metodda doldurulmu�tur.
    	 }
     
     public static void main(String... args) {
    	 
    	 new Q37().print(); // Q37 class olu�turulmas� i�in �nce constructor metod i�letilir.
    	 
     }
}

