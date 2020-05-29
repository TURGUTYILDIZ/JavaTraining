package HW7;

public class Q16_extend extends Q16 {
	
	 public int weight = 2;
	 public int height = 4;
	 public void printDetails() {
		 System.out.print(super.getWeight()+","+super.height); // height deðiþkeni private olmamalýdýr.
	 }
	 
	 public static final void main(String[] fuel) {
		 new Q16_extend().printDetails();
	 } 

}
