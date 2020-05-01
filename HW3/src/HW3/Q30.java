package HW3;

public class Q30 {
	
	public static void main(String...strings) {
		
		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--; // int deðerin null deðerden hariç bir deðer almasý sonucu her zaman "true" döner.
		// true döner.
		System.out.println(y);
		
		w = !z; // ifade true ifadeyi true ifadeye eþitlemiþ.
		System.out.print((x+y)+" "+(w ? 5 : 10)); // 11 5 olur.
		
	}

}


