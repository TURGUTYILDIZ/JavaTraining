package HW7;

public class Q11_extend extends Q11{
			
		public final int process() { return 3; } 
		
		public static void main(String[] chips) {
			
			System.out.print(new Q11_extend().process()); // eðer parent classtan final ifade silinirse
														// derleme gerçeklerþir.
			// CEVAP :  3
		   
		} 

}
