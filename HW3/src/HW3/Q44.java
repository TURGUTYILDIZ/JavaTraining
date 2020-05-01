package HW3;

public class Q44 {
	
	public static void main(String... strings) {
		
		int characters = 5;
		int story = 3;
		double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1; 
		// characters <= 4  	false
		// story > 1 	 		true
		// movieRating = 2 olur.
		
		System.out.println(movieRating);
		//2.0 deðeri döner
		
	}

}



