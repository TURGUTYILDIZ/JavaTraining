package HW2;

public class Q15 {
	
	
	static long defaultValue; // 0.0 degerini verir.

    { System.out.println("1"); } // 2. derlenecek sat�r
    public Q15 () {
   	 System.out.println("2"); // son derlenecek sat�r.
   	 }
    static { System.out.println("3"); } // q15 nesnesi ile static oldu�undan bu sat�r �nce �a��r�l�r.
    { System.out.println("4"); } // 3. derlenecek sat�r.
    
    public static void main(String[] args)
    {
    	Q15 q15 = new Q15();
    	
    	double d = new Double (0.0);
    	
    }
}

