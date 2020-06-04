package HW8;

class OutOfBoundsException extends BadCatchException {} //return  yok
class BadCatchException extends Exception {} //return  yok
public interface Q42 {
	public void catchBall() throws OutOfBoundsException;
}
// RuntimeException haasýndan baþka hata vermez.
	
