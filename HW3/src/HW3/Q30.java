package HW3;

public class Q30 {
	
	public static void main(String...strings) {
		
		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--; // int de�erin null de�erden hari� bir de�er almas� sonucu her zaman "true" d�ner.
		// true d�ner.
		System.out.println(y);
		
		w = !z; // ifade true ifadeyi true ifadeye e�itlemi�.
		System.out.print((x+y)+" "+(w ? 5 : 10)); // 11 5 olur.
		
	}

}


