package HW8;

public class Q43 {
	
	public static void dancing() throws RuntimeException {
		
		try {
			throw new IllegalArgumentException();
			}
		catch (Error e) { // Error dan bir de�i�ken �retilmelidir. yoksa derlenmez.
			System.out.print("Unable!");
			}
		}
	
	public static void main(String... count) throws RuntimeException {
		dancing();
	}
	
}