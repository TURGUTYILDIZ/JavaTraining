package HW3;

public class Q31 {
	
	public static void main(String[] unused) {
		
		String bob = new String("bob");
		String notBob = bob; // notBob "bob" de�erini al�r.
		
		// 1. ifadede e�itlik sa�lan�r. 2. ifadede bob e�itlik metodu kullanarak notBob'a e�ittir.
		System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
		
		System.out.println(12 + 6 * 3 % (1 + 1));
		
	}

}

