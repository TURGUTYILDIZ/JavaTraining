package HW5;

public class Q48 {
	
	public static void main(String...strings) {
		
		  int result = 8;
		  for: while (result > 7) {  // for anahtar s�zc��� etiket olarak verilmi�tir. derlenmeyecektir.
			  result++;
			  do {
				  result--;
				  } while (result > 5);
			  break for;
					  }
		  System.out.println(result);
		
	}


}
