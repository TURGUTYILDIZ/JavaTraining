package HW5;

public class Q50 {
	
	 public static void main(String... args) {
		 String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
		 String[] times = new String[] { "Day", "Night" };
		 
		 for (int i=0, j=0; i < 1; i++, j++)           // int i=0, j=0; de�eri ile sorunsuz bir �ekiklde derlenir.
			 System.out.println(nycTourLoops[i] + " " + times[j]);
		 
	 } 

}
