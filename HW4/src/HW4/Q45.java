package HW4;

public class Q45 {
	
	public static void main(String...strings) {
		
		String[] days = new String[] { "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 1; i < days.length; i++) // dizinin ilk elemanına erişilmez [0] dizinin ilk elemanıdır.
			System.out.println(days[i]);
		
	}

}



