package HW6;

public class Q21 {
	
	 public final static int finish(final int score) {
		 
		 final int win = 3;
		 //final int result = score++ < 5 ? 2 : win; // final bir deðiþkenin adresinde arttýrým yaptýðýndan hata verir.
		 final int result = score < 5 ? 2 : win;
		 //return result+=win;					// final bir deðiþkenin adresinde arttýrým yaptýðýndan hata verir.
		 return result;					
		 
	 }   
	 
	 public static void main(final String[] v) {
		 
		System.out.print(finish(Integer.parseInt(v[0]))); 
		
	} 

}
