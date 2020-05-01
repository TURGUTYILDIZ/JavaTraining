package HW3;

public class Q2 {
	public static void main(String... args) {
		
	int meal = 5;
	int tip = 2;
	
	int total = meal + (meal>6 ? ++tip : --tip); // ?  true : false
	// meal 6 dan küçük olduðundan false bölümü çalýþacaktýr.
	// tip deðeri 1 azalýr.
	
	System.out.println(total);  // 6
	System.out.println(tip);	// 1
	
	}

}
