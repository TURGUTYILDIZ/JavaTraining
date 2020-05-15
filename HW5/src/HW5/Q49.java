package HW5;

public class Q49 {
	
	public static void main(String...strings) {
	
	boolean baloonInflated = false;
	
	do {   
		if (!baloonInflated) { // ilk döngüde "true"
			baloonInflated = true;
			System.out.print("inflate-");
			}
		} while (baloonInflated); // true deðer geldiðinden sonsuz döngüye girer
	
	System.out.println("done");

	
	}
}
