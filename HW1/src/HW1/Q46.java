package HW1;

public class Q46 {

	String color = "red";
	private void printColor(String color) {
		color = "purple"; 	// color de�i�keninin ilk de�eri = "blue" son de�eri = "purple"
		System.out.print(color); // "purple" ekrana ��kar�l�r.
		}
	
	public static void main(String[] rider) {
		new Q46().printColor("blue"); // printColor() metodu "blue" string de�i�kendi g�nderilerek �a��r�l�r.
		}

}



