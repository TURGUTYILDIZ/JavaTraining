package HW5;

import java.util.Arrays;
import java.util.List;

public class Q13 {
	
	public static void main(String[] args) {
		
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		for (int type = 0; type < bottles.size();) { // 0. elemandan Listin uzunlu�u kadar d�n�lecek fakat art�� miktar� verilmemi� �nemli de�il d�ng� i�erisinden verilebilir.
			System.out.print(bottles.get(type) + ","); // Listin ilk eleman� yaz�l�r
			break;										// break ile ilk eleman yaz�ld�ktan sonra d�ng� k�r�l�r.
		}   
		System.out.print("end"); // end yaz�l�r.
		
		//ekran ��kt�s�     "glass,end"  olur.
		
	}


}


