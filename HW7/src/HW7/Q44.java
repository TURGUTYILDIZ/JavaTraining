package HW7;

abstract class House {
	protected abstract Object getSpace();
}

abstract class Room extends House {
	abstract Object getSpace(Object list);
}

abstract public class Q44 extends House {
	protected abstract Object getSpace();
	
	public static void main(String[] squareFootage) {
		System.out.print("Let's start the party!"); // kod sa�l�kl� bir �ekilde derlenecek ve ekrana ��kt� sa�lanacakt�r.
	}
}