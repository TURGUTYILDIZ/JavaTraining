package HW8;

class Organ {
public void operate() throws RuntimeException, Exception { // excepion eklenmelidir.
	throw new RuntimeException("Not supported");
	}
}

public class Q38 extends Organ {
	public void operate() throws Exception {  // Organ clasýna exception eklenelidir.
		System.out.print("beat");
		}
	public static void main(String... cholesterol) throws Exception {
		try {
			new Q38().operate();
			}
		finally {      }
		} 
}
