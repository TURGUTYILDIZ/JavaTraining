package HW8;

interface Source {
	void flipSwitch() throws Exception;
	}
public class Q47 implements Source {
	   public void flipSwitch() {
		   try {
			   new RuntimeException("Circuit Break!");  // throws new RuntimeException hatal� bir yaz�md�r.
			   // hem throws hemde new ile bir nesne olu�turmak yanl��t�r. haa i�in bir nesne olu�turma mant��� javada yoktur.
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

