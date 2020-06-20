package HW10;

public class Q70 {
	
	public int adjustPropellers(int length, String[] type) {
		length++;      type[0] = "LONG";   //  5+1 = 6      string == LONG
		return length;
		
	}   
	
	public static void main(String[] climb) {
		
		final Q70 h = new Q70();
		int length = 5;
		String[] type = new String[1];
		length = h.adjustPropellers(length, type);
		System.out.print(length+","+type[0]);
	   
	}

}
