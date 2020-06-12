package HW9;

public class Q33 {
	
	 public static void main(String[] args) {
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append("red");
		 sb.deleteCharAt(0); // ilk karakteri sil
		 sb.delete(1, 2); // 1 karakter sil 3. terimden itibaren
		 System.out.println(sb);
		 
	 } 

}
