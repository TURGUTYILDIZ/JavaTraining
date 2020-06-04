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
	 
	 public static void main(String[] moat) throws Exception { // 1.)þeklinde exceptin referansý tanýmlanablir.
		 
		 //new Q10().openDrawbridge();  // p3  bu satýrdan dolayý kod derlenmez 
		 new Q10().openDrawbridge();  // 2.) try catch  bloðu içinde yazýlýrsa exceptionlara refere edebilir.
	 } 
		 
	 

}
