package HW8;

public class Q50 {
	public static void snore() throws Exception {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
			}
		catch (RuntimeException e) { 
			System.out.print("Awake!");
			}
		finally {
			throw new Exception();  // x1
			}
		}
	public static void main(String... sheep) throws Exception {  // x2  // snore() metodu kullanýldýðýndan Exception throw olarak eklenmelidir.
		new Q50().snore();  // x3
		}
}

