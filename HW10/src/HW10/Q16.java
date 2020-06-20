package HW10;

public class Q16 {
	
	public static void main(String[] args) {
		
		String shoe1 = new String("sandal");
		String shoe2 = new String("flip flop");
		String shoe3 = new String("croc");
		
	   shoe1 = shoe2;	// flip flop
	   shoe2 = shoe3;	//	croc
	   shoe3 = shoe1;	// flip flop
	   
	   System.out.println(shoe1);
	   System.out.println(shoe2);
	   System.out.println(shoe3);
	   
	}


}
