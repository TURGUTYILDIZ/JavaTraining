package HW7;

interface Sphere { default String getName() { return "Unknown"; }} // interfaceler implementes edilir.

abstract class Planet {   abstract String getName(); } // abstractlar extends edilir.

public class Q24 extends Planet implements  Sphere{
	
	public Q24() {super();}
	
	public String getName() { return "Mars"; }
	
	public static void main(final String[] probe) {
		System.out.print(((Planet)new Q24()).getName());
		}
}

