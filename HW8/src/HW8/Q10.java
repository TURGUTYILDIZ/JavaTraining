package HW8;

public class Q10 {
	
	 public void openDrawbridge() throws Exception {  // p1
		 try {
			 throw new Exception("Circle");
			 }
		 catch (Exception e) {
			 System.out.print("Opening!");
			 }
		 finally {
			 System.out.print("Walls");  // p2
			 }
		 }
	 
	 public static void main(String[] moat) throws Exception { // 1.)�eklinde exceptin referans� tan�mlanablir.
		 
		 //new Q10().openDrawbridge();  // p3  bu sat�rdan dolay� kod derlenmez 
		 new Q10().openDrawbridge();  // 2.) try catch  blo�u i�inde yaz�l�rsa exceptionlara refere edebilir.
	 } 
		 
	 

}
