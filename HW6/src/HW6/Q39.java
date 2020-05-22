package HW6;

public class Q39 {
	
	private int size;
	public Q39(int size) {this.size=size;} 
	
	   public static void sendHome(Q39 p, int newSize) {
		   p = new Q39(newSize);
		   p.size = 4;
	   }
	   
	   public static final void main(String... params) { 
		   final Q39 phone = new Q39(3);
		   sendHome(phone,7);
		   System.out.print(phone.size);
	   }

}
