package HW10;

public class Q21 {
	
	static int teeth; // 0
	double scaleToughness;
	public Q21() {
		teeth++; // 1   2. adýmda 2
		}
	public void snap(int teeth) {
		System.out.print(teeth+" ");
		teeth--;
		}
	public static void main(String[] unused) {
		new Q21().snap(teeth);		//	1
		new Q21().snap(teeth);		//	2
		}

}
