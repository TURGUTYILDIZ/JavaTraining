package HW6;

public class Q37 {
	
	 public static int wag = 5;   // q1
	 
	 // a�a��daki gibi bir kurucu eklenirse derleme sa�lan�r.
	 public Q37(int i) {
		// TODO Auto-generated constructor stub
	}

	public void Q37(int wag) { // q2
		 this.wag = wag;
	 }
	 
	 public static void main(String[] tail) {
		 
		 System.out.print(new Q37(2).wag); // q3 derlenmez void d�n�� tipinde bir kurucu yap�lmaya �al���lm��t�r.
		 
	 } 
	 

}
