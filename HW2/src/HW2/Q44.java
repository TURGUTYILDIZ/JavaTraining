package HW2;

public class Q44 {

	private double beakLength;
	
	public static void setBeakLength(Q44 p, int b) {
		p.beakLength = b; 	//	değişkene dışarıdan değer ataması gerçekleştirilir.
	} 
	   
	public static void main(String... args) {
		
		Q44 q44 = new Q44();
		
		q44.setBeakLength(q44, 10); // nesnenin metodu kullanıldı.
		
		System.out.println(q44.beakLength);
	}

}

 
	   