package HW2;

public class Q14 {

	public static void main(String[] args) {
		String title = "Weather";                // line x1
		//int hot, double cold;                    // line x2 hata verecektir.
		//System.out.println(hot + " " + title);   // line x3 burada hot değişkenine değer atanmamıştır.
		
		
		// Aşağıdaki gibi tanımlama yapılabilir.
		int hot = 5;
		double cold;
		System.out.println(hot + " " + title);
	
	}
}


