package HW7;

public class Q1_extends extends Q1 {
	
	public Q1_extends(String movie) {super(movie);} // kurucu metoda super class ile parent classa erişmesi sağlanmalıdır.
	
	
	// 2 değişiklik yapılısa kod derlenecektir.
	public static void main(String[] showing) {
		System.out.print(new Q1_extends("Another Trilogy").name);
	} 
}
