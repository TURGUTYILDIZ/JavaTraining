package HW3;

public class Q2 {
	public static void main(String... args) {
		
	int meal = 5;
	int tip = 2;
	
	int total = meal + (meal>6 ? ++tip : --tip); // ?  true : false
	// meal 6 dan k���k oldu�undan false b�l�m� �al��acakt�r.
	// tip de�eri 1 azal�r.
	
	System.out.println(total);  // 6
	System.out.println(tip);	// 1
	
	}

}
