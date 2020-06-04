package HW8;

public class Q41 {
	public static void main(String... hammer) { 
		try {
			throw new ClassCastException();
			}
		catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
			}
		catch (RuntimeException e) {
			throw new NullPointerException();
			}
		finally {
			throw new RuntimeException(); // finally kod satýrý kesin çalýþtýrýlacaðýndan bu hata alýnýr.
			}
		}
	}


