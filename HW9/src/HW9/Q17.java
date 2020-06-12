package HW9;

public class Q17 {
	
	 interface Target {
		 boolean needToAim(double angle); // 45 büyük 5  true
		 }
	 static void prepare(double angle, Target t) {
		 boolean ready = t.needToAim(angle);  // k1
		 System.out.println(ready);
		 }
	 public static void main(String[] args) {

     prepare(45, d -> d > 5 || d < -5);   // k2
     }
	 
}