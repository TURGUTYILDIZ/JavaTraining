package HW7;

abstract class Ball {
	protected final int size;
	
	public Ball(int size) {      
		this.size = size;
	}
}

interface Equipment {}

public class Q29 extends Ball implements Equipment {
	public Q29() {
		super(5);
	}
	
	public Ball get() { return this; }
	
	
	public static void main(String[] passes) {
		
		Equipment equipment = (Equipment)(Ball)new Q29().get(); // interfaceten bir nesne oluþturuluyor.
		System.out.print(((Q29)equipment).size);
		
		} 
}