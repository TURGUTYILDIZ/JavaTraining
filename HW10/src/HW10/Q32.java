package HW10;

public class Q32 {
	
	 public static void main(String[] args) {
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append("red");	// red de�erini ata
		 sb.deleteCharAt(0); // ilk eleman� sil
		 sb.delete(1, 1); 	// 1 tane 1 sil
		 System.out.println(sb);  		//  "ed"
		 
	 } 

}
