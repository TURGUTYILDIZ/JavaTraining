package HW8;

class Problem implements RuntimeException {}
public class Q46 extends Problem {
	public static void main(String uhOh[]) {
		try {
			throw new Q46();
			}
		catch (Q46 re) {
			System.out.print("Problem?");
			}
		catch (Problem e) {
			System.out.print("Handled");
			}
		finally {
			System.out.print("Fixed!");
			}
		}
}