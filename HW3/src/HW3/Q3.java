package HW3;

public class Q3 {
	
	public static void main(String... data) {
		
		String john = "john"; 
		String jon = new String(john); // new ile yeni bir string oluşturuldu.
		
		// yeni oluşturulan string ile "==" operatörü ile kontrol yapıldığında "FALSE" döner.
		// 2 nesnede birbirine eşitlendiğinden 2. karşılaştırma "TRUE" döner.
		System.out.print((john==jon)+" "+(john.equals(jon)));
		
	}

}

