package HW6;

public class Q10 {

	private int rope = 1;
	protected boolean outside; // false de�er atanmaktad�r.
	
	public Q10() {      
		// p1
		this(4); // de�erle �a��r�lan kurucuyu �al��t�r�.
		outside = true;
	}   
	
	public Q10(int rope) { 
		this.rope = outside ? rope : rope+1; // outside = false old. 4+1 = 5 �al���r.
	}   
	
	public static void main(String[] bounce) {
		
		System.out.print(new Q10().rope); // class�n de�i�kenini �a��rd���ndan de�iken hengi de�ere sahipse o ��kt� al�n�r.
											// 5 de�erini alabilmek i�in this(4) kullan�lmal�d�r.
	} 
	

	
}
