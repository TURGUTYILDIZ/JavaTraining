package HW10;

public class Q29 extends Q29_1 {
	
	//public Q29()  {} // hatal� bo� metod
	
	//public Q29(int deep) {super(false); this(); } // referans hatas�
	
	public Q29(String now, int... deep) {
		this(3);
		}
	
	//public Q29(long deep) {	this("check",deep);	} // anlams�z this kullan�m�
	
	public Q29(double test) {
		super(test>5 ? true : false);
		}
	
}
