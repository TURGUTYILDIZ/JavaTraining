package HW2;

public class Q19 {

	
	     private String name;
	     private Q19 next;
	     
	     public Q19(String name, Q19 next) {
	    	 this.name = name;
	    	 this.next = next;
	    	 }
	     
	     public void setNext(Q19 next) {
	    	 this.next = next;
	    	 }
	     
	     public Q19 getNext() {
	    	 return next;
	    	 }
	     
	     public static void main(String... args) {
	    	 
	    	 Q19 q19_1 = new Q19("x", null);
	    	 Q19 q19_2 = new Q19("y", q19_1);
	    	 Q19 q19_3 = new Q19("z", q19_2);
	    	 // Yukarýda 3 tane nesne olusturuluyor.
	    	 
	    	 System.out.println(q19_1.getNext());
	    	 System.out.println(q19_2.getNext());
	    	 System.out.println(q19_3.getNext());
	    	 	    	 
	    	 q19_2.setNext(q19_3);	//	q19_2 nesnesi q19_3 nesnesini iþaret eder.
	    	 System.out.println(q19_1.getNext());
	    	 System.out.println(q19_2.getNext());
	    	 System.out.println(q19_3.getNext());
	    	 
	    	 q19_3.setNext(q19_2);	//	q19_3 nesnesi q19_2 nesnesinin kendisini iþaret ettiðinden dolayý yine kendi deðeri kalýr.
	    	 System.out.println(q19_1.getNext());
	    	 System.out.println(q19_2.getNext());
	    	 System.out.println(q19_3.getNext());
	    	 
	    	 q19_1 = null;	//	q19_1 nesnesine eriþilemez
	    	 q19_3 = null;	//	q19_3 nesnesine eriþilemez
	    	 
	     }
	     
	
	
}



