package HW9;

public class Q39 {

	public static void main(String...strings) {
		
		String happy = " :) - (: ";
		String really = happy.trim();
		String question = happy.substring(1, happy.length() - 1); // terslendiğinde boşluğu -1 ile çıkarılır.
		System.out.println(really.equals(question));
		
		
	}
	
}
