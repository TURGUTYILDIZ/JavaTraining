package HW3;

public class Q4 {
	
	public static void main(String[] input) {
		
		int plan = 1;

		plan = plan++ + --plan; // plan++ iþlemi bu satýrdan sonra devreye girerek sonucu 1 arttýrýr.
		// --plan operatörü önce deðeri azaltýr sonra iþlemi yapar.
		
		
		if(plan==1) 
			System.out.print("Plan A");
		else if(plan==2) 
			System.out.print("Plan B"); // sonuç 2 çýkýcaktýr.
		else 
			System.out.print("Plan C");
			
	}
			

}

