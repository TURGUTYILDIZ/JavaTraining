package HW3;

public class Q24 {
	
	public final static void main(String... args) {
		
		int flavors = 30;
		int eaten = 0;
		switch(flavors) { // b�t�n case ifadelerine girilecektir. ��nki her hangi bir kontrol ifadesi konulmam��t�r.
			case 30: 
				eaten++;  // 1
			case 40: 
				eaten+=2; // 3
			default: 
				eaten--;  // 2	
		}
		
		System.out.print(eaten); // 2
		
	}

}

