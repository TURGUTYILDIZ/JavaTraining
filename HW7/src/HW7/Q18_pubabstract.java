package HW7;

public class Q18_pubabstract extends Q18{ // g2   // abstract olursa soyutlaþtýrýlýr bundan dolayý derlenmeyecektir.

		public String getDescription() { return "irt"; }
		
		public static void main(String[] edges) {
			final Q18 shape = new Q18_pubabstract(); // g3  // soyut sýnýf somutlaþtýrýldýðýndan derlenmeyecektir.    
			System.out.print(shape.getDescription());
		}
	

}
