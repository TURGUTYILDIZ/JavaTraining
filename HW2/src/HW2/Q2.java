package HW2;

public class Q2 {

	static String str; // olu�turulan str de�i�keni "null" de�erdir.
	
	public static void main(String... args) {
		String chair, table = "metal"; // chair'a de�er atanmad���ndan de�i�ken �a�r�lamaz.
		
		//
		chair = "Once deger ata sonra kullan.";
		//
		
		chair = chair + table;
		System.out.println(chair);
		
		System.out.println("Stringe ilk de�er atamas� yap�lmazsa de�eri = " + str + " olur.");
	}

}
