package HW6;

public class Q44 {
	
	  public final static long numberOfTrees;
	  public final double height; // stataic i�inden eri�ilmeye �al���ld���ndan static bir de�i�ken olarak tan�mlanmal�d�r.
	  
	  static {}   
	  
	  { 
		  final int initHeight = 2;
		  height = initHeight;
	  }
	  
	  static {
		  numberOfTrees = 100;
		  height = 4;
	  } 

}
