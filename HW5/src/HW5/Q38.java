package HW5;

public class Q38 {
		
		private static int count;
		private static String[] stops = new String[] { "Washington",
				"Monroe", "Jackson", "LaSalle" };
		
		public static void main(String[] args) {
			
			while (count < stops.length) { // count 4 olana kadar döngü devam edecektir.
				if (stops[count++].length() < 8) {
					continue;
				}      
			}      
			
			System.out.println(count);
			
		} 		

}
