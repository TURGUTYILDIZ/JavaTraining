package HW4;

import java.util.Arrays;

public class Q18 {
	
	public static void main(String...strings ) {
	
	//char[][] ticTacToe = new char[3,3];                  // r1
	char[][] ticTacToe = new char[3][3];		// Bu �ekilde tan�mlan�rsa hata ile kar��la��lmaz.
	ticTacToe[1][3] = 'X';                               // r2
	ticTacToe[2][2] = 'X';
	ticTacToe[3][1] = 'X';
	System.out.println(ticTacToe.length + " in a row!"); // r3
	
	}
	
}
