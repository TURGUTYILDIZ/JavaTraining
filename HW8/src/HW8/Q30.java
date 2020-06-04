package HW8;

abstract class Duck {
	protected int count; // 0 deðerindedir
	public abstract int getDuckies();
	
}

public class Q30 extends Duck {
	private int age;
	public Q30(int age) { this.age = age; }
	public int getDuckies() {
		return this.age/count;  // 5/0 tanýmsýzdýr . ArithmeticException döner.
		}
	
	public static void main(String[] pondInfo) {
		Duck itQuacks = new Q30(5);
		System.out.print(itQuacks.getDuckies());
		}
	}

