package HW2;

public class Q48 {
	
	public void play() {
		System.out.print("play-");
	}  
	
	public void finalize() {
		System.out.print("clean-");
	}   
	
		public static void main(String[] args) {
			
			Q48 car = new Q48();
			car.play();
			System.gc();
			
			Q48 doll = new Q48();
			doll.play();
			
		}

}


