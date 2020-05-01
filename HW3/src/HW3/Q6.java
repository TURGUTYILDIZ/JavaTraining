package HW3;

public class Q6 {
	
	public static void main(String...strings) {
		
		long thatNumber = 5 >= 5 ? 1+2 : 1*1; // 5 5'e eşit veya büyük olduğundan "1+2" ifadesi geçerlidir.
		
		System.out.println(thatNumber);
		
		if(++thatNumber < 4)  { 	// "thatNumber" değişkeni 4 olur fakat 4 < 4 olduğundan içeri girmez.
			System.out.println("buraya girmeyecek...");
			thatNumber += 1;		
		}
		
		System.out.println(thatNumber);
		
	}
}


