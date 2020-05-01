package HW3;

public class Q9 {
	
	
	// 2 tane integer ifadeye "&&" uygulanmýþ ve boolean bir deðiþkene atanmaya çalýþýldýðýndan ifade derlenmez.
	/*
	public void calculateResult(Integer candidateA, Integer candidateB) {
		
		boolean process = candidateA == null || candidateA.intValue() < 10;
		boolean value = candidateA && candidateB;
		System.out.print(process || value);
		
		}
	*/
	
	public void calculateResult(Boolean candidateA, Boolean candidateB) {
		
		boolean process = candidateA == null || candidateA.booleanValue();
		boolean value = candidateA && candidateB;
		System.out.print(process || value);
	}
	
	public static void main(String[] unused) {
		
		// new Q9().calculateResult(null,203); 	// "null" ile gönderilen deðiþken null pointer exception hatasý verecektir.
		
		//Düzngün bir ifade yazmak gerekirse
		
		new Q9().calculateResult(true, false);
		
		}

}



