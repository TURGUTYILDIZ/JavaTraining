package HW9;

public class Q20 {
	
	public static void main(String...strings) {
		
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").insert(7, "robots");  // 7. karakterden itibaren yerleþtir.
		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("radical ");
		sb2 = new StringBuilder("radical ").insert(sb2.length(), "robots");
		System.out.println(sb2);
		
		
		
	}

}
