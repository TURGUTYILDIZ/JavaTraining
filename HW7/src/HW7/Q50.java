package HW7;

import java.io.*;

public class Q50 extends Q50_ext {
	public boolean turnOn() throws IOException {return false;}
	
	public static void main(String[] doesNotCompute) throws Exception {
		
		Q50_ext m = new Q50();
		System.out.print(m.turnOn());
		
	}
	
}

