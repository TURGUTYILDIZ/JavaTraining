package HW4;

public class Q42 {
	
	static int[][] game;

	public static void main(String[] args) {
		game[3][3] = 6;
		Object[] obj = game;
		//game[3][3] = "X"; // int diziye string de�er atamas� yap�lm��t�r. hata verir.
		System.out.println(game[3][3]);
		} 

}
