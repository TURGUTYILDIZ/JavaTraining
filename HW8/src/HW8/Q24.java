package HW8;

public class Q24 {
	
	public void compute() throws Exception {
		throw new RuntimeException("Error processing request");
	}
	public static void main(String[] bits) throws Exception {
		try {
			new Q24().compute();
			System.out.print("Ping");
			}
		catch (NullPointerException e) {
			System.out.print("Pong");
			throw e;
			}
	} 

}


