package HW7;

public class Q11_extend extends Q11{
			
		public final int process() { return 3; } 
		
		public static void main(String[] chips) {
			
			System.out.print(new Q11_extend().process()); // e�er parent classtan final ifade silinirse
														// derleme ger�ekler�ir.
			// CEVAP :  3
		   
		} 

}
