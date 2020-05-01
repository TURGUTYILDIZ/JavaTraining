package HW3;

public class Q31 {
	
	public static void main(String[] unused) {
		
		String bob = new String("bob");
		String notBob = bob; // notBob "bob" deðerini alýr.
		
		// 1. ifadede eþitlik saðlanýr. 2. ifadede bob eþitlik metodu kullanarak notBob'a eþittir.
		System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
		
		System.out.println(12 + 6 * 3 % (1 + 1));
		
	}

}

