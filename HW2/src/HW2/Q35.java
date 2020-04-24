package HW2;

public class Q35 {

	public static void main(String[] fruits) {
		String fruit1 = new String("apple");
		String fruit2 = new String("orange");
		String fruit3 = new String("pear");
		
		
		fruit3 = fruit1;	//	fruit3 "apple" 
		fruit2 = fruit3;	//	fruit2 "apple"	//	fruit3 silinebilir.
		fruit1 = fruit2;	//	fruit1 "apple"	//	fruit2 silinebilir.
		
	} // 2 string ifade "fruit2, fruit3" silinebilir. 
	
}


