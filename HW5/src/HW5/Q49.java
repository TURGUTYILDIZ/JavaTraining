package HW5;

public class Q49 {
	
	public static void main(String...strings) {
	
	boolean baloonInflated = false;
	
	do {   
		if (!baloonInflated) { // ilk d�ng�de "true"
			baloonInflated = true;
			System.out.print("inflate-");
			}
		} while (baloonInflated); // true de�er geldi�inden sonsuz d�ng�ye girer
	
	System.out.println("done");

	
	}
}
