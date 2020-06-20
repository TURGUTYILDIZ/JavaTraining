package HW10;

public class Q11 {
	
	public static void main(String...strings) {
		
		String race = "";
		//outer:									1
		//	do {									2
		//	inner:									3
				do {
				race += "x";
				} while (race.length() <= 4);
		//} while (race.length() < 4);				4
		System.out.println(race);
		
		
		
	}
	

}
