package HW3;

public class Q46 {
	
	public static void main(String... weather) {
		
		System.out.print(weather[0]!=null      // uzunluðu olmayan bir dizi mantýksal olarak != ifadesi ile kontrol edilmeye çalýþýlmýþtýr.
											   // java.lang.ArrayIndexOutOfBoundsException  hatasý ortaya çýkmýþtýr.
				&& weather[0].equals("sunny")            
				&& !false         ? "Go Outside" : "Stay Inside");
		
		
		
	}

}


