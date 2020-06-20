package HW10;

public class Q14 {
	
	 static int[][] game;
	
	 public static void main(String args[]) {
		 
		 game[3][3] = 6;
		 Object[] obj = game;
		 obj[3] = 'X';
		 System.out.println(game[3][3]);
	 
	 } 

}
