package HW3;

public class Q46 {
	
	public static void main(String... weather) {
		
		System.out.print(weather[0]!=null      // uzunlu�u olmayan bir dizi mant�ksal olarak != ifadesi ile kontrol edilmeye �al���lm��t�r.
											   // java.lang.ArrayIndexOutOfBoundsException  hatas� ortaya ��km��t�r.
				&& weather[0].equals("sunny")            
				&& !false         ? "Go Outside" : "Stay Inside");
		
		
		
	}

}


