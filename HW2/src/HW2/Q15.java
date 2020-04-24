package HW2;

public class Q15 {
	
	
	static long defaultValue; // 0.0 degerini verir.

    { System.out.println("1"); } // 2. derlenecek satýr
    public Q15 () {
   	 System.out.println("2"); // son derlenecek satýr.
   	 }
    static { System.out.println("3"); } // q15 nesnesi ile static olduðundan bu satýr önce çaðýrýlýr.
    { System.out.println("4"); } // 3. derlenecek satýr.
    
    public static void main(String[] args)
    {
    	Q15 q15 = new Q15();
    	
    	double d = new Double (0.0);
    	
    }
}

