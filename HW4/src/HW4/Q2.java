package HW4;

public class Q2 {
	
	public void toss (int... f) {
		
		int first = f[0]; // gönderilen ilk eleman [0] ekrana yazdýrýlmak üzere çýkarýlýr.
		System.out.println(first);
		
		}
	public static void main(String...strings) {
		
		Q2 q2 = new Q2();
		
		q2.toss(58);
		
	}


}
