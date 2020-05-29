package HW7;

public class Q32_ext extends Q32 {
	
	private int height = 10;
	protected int fly() {
		return super.height;
	}
	
	public static void main(String[] unused) {
		Q32_ext h = (Q32_ext)new Q32();
		System.out.print(h.fly());
		}

}

