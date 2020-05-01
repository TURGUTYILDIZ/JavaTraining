package HW3;

public class Q20 {
	
	public static void main(String[] vars) {
		int leaders = 10 * (2 + (1 + 2 / 5)); // Burada parantez eksikliði olduðundan derlenmeyecekti.
		int followers = leaders * 2;
		System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
		} 

}
