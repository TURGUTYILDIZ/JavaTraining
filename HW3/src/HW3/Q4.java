package HW3;

public class Q4 {
	
	public static void main(String[] input) {
		
		int plan = 1;

		plan = plan++ + --plan; // plan++ i�lemi bu sat�rdan sonra devreye girerek sonucu 1 artt�r�r.
		// --plan operat�r� �nce de�eri azalt�r sonra i�lemi yapar.
		
		
		if(plan==1) 
			System.out.print("Plan A");
		else if(plan==2) 
			System.out.print("Plan B"); // sonu� 2 ��k�cakt�r.
		else 
			System.out.print("Plan C");
			
	}
			

}

