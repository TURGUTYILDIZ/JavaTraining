package HW3;

public class Q6 {
	
	public static void main(String...strings) {
		
		long thatNumber = 5 >= 5 ? 1+2 : 1*1; // 5 5'e e�it veya b�y�k oldu�undan "1+2" ifadesi ge�erlidir.
		
		System.out.println(thatNumber);
		
		if(++thatNumber < 4)  { 	// "thatNumber" de�i�keni 4 olur fakat 4 < 4 oldu�undan i�eri girmez.
			System.out.println("buraya girmeyecek...");
			thatNumber += 1;		
		}
		
		System.out.println(thatNumber);
		
	}
}


