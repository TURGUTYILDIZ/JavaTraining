package HW6;

public class Q44 {
	
	  public final static long numberOfTrees;
	  public final double height; // stataic içinden erişilmeye çalışıldığından static bir değişken olarak tanımlanmalıdır.
	  
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
