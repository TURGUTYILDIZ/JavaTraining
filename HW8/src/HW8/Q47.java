package HW8;

interface Source {
	void flipSwitch() throws Exception;
	}
public class Q47 implements Source {
	   public void flipSwitch() {
		   try {
			   new RuntimeException("Circuit Break!");  // throws new RuntimeException hatalý bir yazýmdýr.
			   // hem throws hemde new ile bir nesne oluþturmak yanlýþtýr. haa için bir nesne oluþturma mantýðý javada yoktur.
			   }
		   finally {
			   System.out.print("Flipped!");
			   }
		   }
	   public static void main(String... electricity) throws Throwable {
		   final Source bulb = new Q47(); 
		   bulb.flipSwitch();
		   }
	   }

