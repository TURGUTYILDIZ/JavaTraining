package HW3;

public class Q41 {
	
	public static int getResult(int threshold) { // 5 ten b�y�k bir de�erle �a��r�lmad�...
		
		return threshold > 5 ? 1 : 0;
	}   
	
	public static final void main(String[] days) {
		
			// t�m mettod �a�r�lar�nda false d�n�� sa�land��� i�in 0 yan�t� gelecektir.
			System.out.print(getResult(5) + getResult(1) + getResult(0) + getResult(2) + "");
	} 

}
