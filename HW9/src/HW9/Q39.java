package HW9;

public class Q39 {

	public static void main(String...strings) {
		
		String happy = " :) - (: ";
		String really = happy.trim();
		String question = happy.substring(1, happy.length() - 1); // terslendi�inde bo�lu�u -1 ile ��kar�l�r.
		System.out.println(really.equals(question));
		
		
	}
	
}
