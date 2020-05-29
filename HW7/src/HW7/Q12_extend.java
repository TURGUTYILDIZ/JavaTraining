package HW7;

import java.io.*;

public class Q12_extend extends Q12 {
	
		 public int getNumberOfStudentsPerClassroom() throws FileNotFoundException
		 {      
			 return 2;
		 }
		 public static void main(String[] students) throws IOException {
			 Q12 school = new Q12_extend(); // sub class cinsinden nesne oluþturuluyor.
			 System.out.print(school.getNumberOfStudentsPerClassroom()); //subclassýn metodu çaðrýlýyor. 
		 }

}
