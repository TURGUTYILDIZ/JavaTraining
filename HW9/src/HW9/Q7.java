package HW9;

public class Q7 {
	
	public static void main(String...strings) {
		
		StringBuilder sb = new StringBuilder("radical");
		//		.insert(sb.length(), "robots"); metod sadece 1 tane de�i�ken imzas� almaktad�r.
		sb.append(sb.length());
		sb.append("robots");
		
		System.out.println(sb);

		
	}

}
