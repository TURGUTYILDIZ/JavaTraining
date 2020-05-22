package HW6;

public class Q46 {
	
	 public Q46() {
		 super();
		 }
	 
	 public int choose(int choice) { return 5; }
	 public int choose(short choice) { return 2; }
	 public int choose(long choice) { return 11; }
	 
	 public static void main(String[] path) {
		 
		 System.out.print(new Q46().choose((byte)2+1)); // 2 bayt olur fakat daha sonra 1 ile toplanýnca int deðere dönüþür.
		 
	 }

}
