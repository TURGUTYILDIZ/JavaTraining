package HW3;

public class Q23 {

	public static void main(String[] input) {
		
		int dog = 11;
		int cat = 3;
		int partA = dog / cat;  // partA = 3
		int partB = dog % cat;	// partB = 2
		int newDog = partB + partA * cat;  // 2 + (3*3) = 11
		System.out.print(newDog);
		
		}
}
