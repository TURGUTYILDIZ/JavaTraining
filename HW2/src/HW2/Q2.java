package HW2;

public class Q2 {

	static String str; // oluþturulan str deðiþkeni "null" deðerdir.
	
	public static void main(String... args) {
		String chair, table = "metal"; // chair'a deðer atanmadýðýndan deðiþken çaðrýlamaz.
		
		//
		chair = "Once deger ata sonra kullan.";
		//
		
		chair = chair + table;
		System.out.println(chair);
		
		System.out.println("Stringe ilk deðer atamasý yapýlmazsa deðeri = " + str + " olur.");
	}

}
