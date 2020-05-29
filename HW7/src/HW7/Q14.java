package HW7;

interface Run {
	   default void walk() {
		   System.out.print("Walking and running!");
	   } 
}

interface Jog {
	default void walk() {
		System.out.print("Walking and jogging!");
	} 
}

public class Q14 implements Run, Jog {   
	public void walk() {
		System.out.print("Sprinting!");
	}
	
	public static void main() {
		new Q14().walk();
	}
}