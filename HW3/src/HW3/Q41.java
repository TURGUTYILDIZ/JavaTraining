package HW3;

public class Q41 {
	
	public static int getResult(int threshold) { // 5 ten büyük bir deðerle çaðýrýlmadý...
		
		return threshold > 5 ? 1 : 0;
	}   
	
	public static final void main(String[] days) {
		
			// tüm mettod çaðrýlarýnda false dönüþ saðlandýðý için 0 yanýtý gelecektir.
			System.out.print(getResult(5) + getResult(1) + getResult(0) + getResult(2) + "");
	} 

}
