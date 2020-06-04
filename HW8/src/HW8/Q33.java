package HW8;

public class Q33 {
	public static void main(String...strings) {
		final Object exception = new Exception();
		final Exception data = (RuntimeException)exception;
		System.out.print(data);
	}
}
