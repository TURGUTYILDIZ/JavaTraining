package HW9;

public class Q39 {

	public static void main(String...strings) {
		
		String happy = " :) - (: ";
		String really = happy.trim();
		String question = happy.substring(1, happy.length() - 1); // terslendiðinde boþluðu -1 ile çýkarýlýr.
		System.out.println(really.equals(question));
		
		
	}
	
}
