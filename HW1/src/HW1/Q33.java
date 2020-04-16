/*
public class Airplane {
	
	static int start = 2;
	final int end;
	public Airplane(int x) {
		x = 4;
		end = x;
}   public void fly(int distance) {
	System.out.print(end-start+" ");
	System.out.print(distance);
	
}   public static void main(String... start) {
	new Airplane(10).fly(5);
	}
}
*/

package HW1;

public class Q33 {
	static int start = 2;
	final int end;
	
	public Q33(int x) { // x = 10
		x = 4; 			// x = 4
		end = x;		// end = 4
	}
	public void fly(int distance) { // 5
		System.out.print(end-start+" "); // 4-2 = 2 || çýktý = 2
		System.out.print(distance); 	 // çýktý = 5
	}
	
	public static void main(String[] start) {
		new Q33(10).fly(5); // Q33 class'ýnýn constructor metoduna 10 deðeri ve fly metoduna 5 deðeri gönderiliyor.
		}
	
	
}
