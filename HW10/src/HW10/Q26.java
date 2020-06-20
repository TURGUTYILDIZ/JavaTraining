package HW10;

interface Plant {
	default String grow() {
		return "Grow!";
		}
	}

interface Living {
	public default String grow() {
		return "Growing!";
		}
	}

public class Q26 implements Plant, Living {  // m1  // super classlarý iþlenmeden derleme olmaz.
	public String grow(int height) {
		return "Super Growing!";
		}
	@Override
	public String grow() {
		// TODO Auto-generated method stub
		return Living.super.grow();
	}
	public static void main(String[] leaves) {
		Plant p = new Q26();  // m2
		System.out.print(((Living)p).grow());  // m3
		}
	
	
}

