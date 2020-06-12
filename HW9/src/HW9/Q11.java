package HW9;

public class Q11 {
	
	public static void main(String...strings) {
		
		StringBuilder line = new StringBuilder("1");
		StringBuilder anotherLine = line.append("1");
		System.out.print(line == anotherLine); // eþitlik doðrudur.  //true
		System.out.print(" ");
		System.out.println(line.length()); // line stringine 1 ekleniyor ve anotherLine stringine atanýyor.
		System.out.println(line);
		
	}

}
