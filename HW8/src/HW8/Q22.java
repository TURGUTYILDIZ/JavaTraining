package HW8;

class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}
public class Q22 {
	public void openDrawbridge() throws RuntimeException, CastleUnderSiegeException {  // q1
		try {
			throw new KnightAttackingException();
			}
		catch (Exception e) {
			throw new ClassCastException();
			} 
		finally {
			throw new CastleUnderSiegeException();  // q2 kllan�c� araf�ndan girilen bir exception oldu�undan throw ile deklare edilmelidir.
				}
		}
	public static void main(String[] moat) throws RuntimeException, CastleUnderSiegeException {
		new Q22().openDrawbridge();  // q3
		
		}
}

