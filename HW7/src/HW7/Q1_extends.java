package HW7;

public class Q1_extends extends Q1 {
	
	public Q1_extends(String movie) {super(movie);} // kurucu metoda super class ile parent classa eriþmesi saðlanmalýdýr.
	
	
	// 2 deðiþiklik yapýlýsa kod derlenecektir.
	public static void main(String[] showing) {
		System.out.print(new Q1_extends("Another Trilogy").name);
	} 
}
