package HW8;

import java.io.*;

public class Q14 {
	
	 public void print() {
		 try {
			 throw new FileNotFoundException();
			 }
		 catch (IOException exception) {
			 System.out.print("Z");
			 }
		 //Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
		 // yani bir �stteki catch blo�unda IOException kullan�ld���ndan exception sub clas�na izin verilmeyecektir. 
		 //catch (FileNotFoundException enfe) {
		//	 System.out.print("X");
		//	 }
		 finally {
			 System.out.print("Y");
			 }
		 }
	 
	   public static void main(String... ink) {
		   new Q14().print();
	   } 

}
