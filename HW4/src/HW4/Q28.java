package HW4;

public class Q28 {

	static int[][] game = new int[6][6];
	   
    public static void main(String[] args) {
    	
   	 game[3][3] = 6;
   	 Object[] obj = game;
   	 //obj[3] = "X"; // int bir diziye string bir ifade atamasý yapýlmaktadýr. Bundan dolayý hata verecektir.
   	 System.out.println(game[3][3]);
   	 
   	 }
	
}
