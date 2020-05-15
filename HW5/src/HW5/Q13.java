package HW5;

import java.util.Arrays;
import java.util.List;

public class Q13 {
	
	public static void main(String[] args) {
		
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		for (int type = 0; type < bottles.size();) { // 0. elemandan Listin uzunluðu kadar dönülecek fakat artýþ miktarý verilmemiþ önemli deðil döngü içerisinden verilebilir.
			System.out.print(bottles.get(type) + ","); // Listin ilk elemaný yazýlýr
			break;										// break ile ilk eleman yazýldýktan sonra döngü kýrýlýr.
		}   
		System.out.print("end"); // end yazýlýr.
		
		//ekran çýktýsý     "glass,end"  olur.
		
	}


}


