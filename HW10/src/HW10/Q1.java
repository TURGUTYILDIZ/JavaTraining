package HW10;

public class Q1 {
	
	 public static void main(String... books) {
		 
		 StringBuilder sb = new StringBuilder(); // string builder olu�tu.
		 
		 for (String book : books)
			 sb.insert(sb.indexOf("c"), book);
		 
		 System.out.println(sb);
	 
	 } 

}
