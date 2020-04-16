package HW1;

public class Q46 {

	String color = "red";
	private void printColor(String color) {
		color = "purple"; 	// color deðiþkeninin ilk deðeri = "blue" son deðeri = "purple"
		System.out.print(color); // "purple" ekrana çýkarýlýr.
		}
	
	public static void main(String[] rider) {
		new Q46().printColor("blue"); // printColor() metodu "blue" string deðiþkendi gönderilerek çaðýrýlýr.
		}

}



