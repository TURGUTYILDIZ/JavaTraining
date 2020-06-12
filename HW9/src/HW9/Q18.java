package HW9;

public class Q18 {
	
	public static void main(String...strings) {
		
		String teams = new String("694");
		teams.concat(" 1155");
		teams.concat(" 2265");
		teams.concat(" 2869");
		System.out.println(teams);  // teams nesnesi yukarýdaki concat ile deðiþtirilmez.
		
		String teams2 = "694";
		String s3 = teams.concat(teams2);
		System.out.println(s3);   // concat metodu çalýþýr ve 2 stringi birleþtirir.
		
		
	}

}
