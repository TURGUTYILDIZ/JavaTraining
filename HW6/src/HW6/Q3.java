package HW6;

public class Q3 {
	
	 private static int price = 5;
	 
	 public boolean sell() { // metodun return ifadesi if-else i�erisinde olmamal�d�r yoksa derlenmez.
		 
		 if(price<10) {
			 price++;
			 return true;
		 } 
		 else if(price>=10) {
			 return false;
			 }
		 
		 return false; // bu ifade olmas� gerekir if-else i�erisindeki return ifadesi kodu yanl�� yapar.
		 
		 }   
	 
	 public static void main(String[] cash) {
		 
		 new Q3().sell();
		 new Q3().sell();
		 new Q3().sell();
		 System.out.print(price);
		 
	 } 

}
