package HW10;

public class Q48 {
	
	public int drive(long car) { return 2; }
	public int drive(double car) { return 3; }
	public int drive(int car) { return 5; }
	public int drive(short car) { return 3; }
	public static void main(String[] gears) {
		// a�a��daki derlemede   " 3 "  de�eri olu�ur.
		//short value = 5;
		//byte value = 5;
		float value = 5;		
		
		System.out.print(new Q48().drive(value));
		
	} 

}
