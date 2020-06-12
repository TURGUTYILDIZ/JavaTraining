package HW9;

public class Q27 {
	
	public static void main(String...strings) {
		
		String line = new String("-");
		String anotherLine = line.concat("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.println(line.length()); // string ifadesinin deðeri deðiþmedi.
		System.out.print(anotherLine.length()); // yeni stringin deðeri 2 oldu.
		
	}

}
