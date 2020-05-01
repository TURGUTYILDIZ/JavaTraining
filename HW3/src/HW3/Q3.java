package HW3;

public class Q3 {
	
	public static void main(String... data) {
		
		String john = "john"; 
		String jon = new String(john); // new ile yeni bir string oluþturuldu.
		
		// yeni oluþturulan string ile "==" operatörü ile kontrol yapýldýðýnda "FALSE" döner.
		// 2 nesnede birbirine eþitlendiðinden 2. karþýlaþtýrma "TRUE" döner.
		System.out.print((john==jon)+" "+(john.equals(jon)));
		
	}

}

