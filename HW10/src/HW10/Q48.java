package HW10;

public class Q48 {
	
	public int drive(long car) { return 2; }
	public int drive(double car) { return 3; }
	public int drive(int car) { return 5; }
	public int drive(short car) { return 3; }
	public static void main(String[] gears) {
		// aþaðýdaki derlemede   " 3 "  deðeri oluþur.
		//short value = 5;
		//byte value = 5;
		float value = 5;		
		
		System.out.print(new Q48().drive(value));
		
	} 

}
