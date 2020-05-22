package HW6;

public class Q10 {

	private int rope = 1;
	protected boolean outside; // false deðer atanmaktadýr.
	
	public Q10() {      
		// p1
		this(4); // deðerle çaðýrýlan kurucuyu çalýþtýrý.
		outside = true;
	}   
	
	public Q10(int rope) { 
		this.rope = outside ? rope : rope+1; // outside = false old. 4+1 = 5 çalýþýr.
	}   
	
	public static void main(String[] bounce) {
		
		System.out.print(new Q10().rope); // classýn deðiþkenini çaðýrdýðýndan deðiken hengi deðere sahipse o çýktý alýnýr.
											// 5 deðerini alabilmek için this(4) kullanýlmalýdýr.
	} 
	

	
}
