package HW5;

public class Q31 {
	
	public static void main(String...strings) {
		
		int k = 0;
		for (int i = 10; i > 0; i-- ) { // döngünün son adýmýnda i = 0 olur.
			
			while (i > 3) 
				i -= 3; 	// döngü sonunda i = 1 olur.
			
			k += 1;
			
			} System.out.println(k); // döngü toplamda 1 kere döner.

		
		
	}

}
