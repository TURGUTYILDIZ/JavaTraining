package HW5;

import java.util.List;
import java.util.Arrays;

public class Q33 {

		
		public static void main(String[] args) {
			
			List<String> bottles = Arrays.asList("glass", "plastic");
			
			for (int type = 0; type < bottles.size();)     
				System.out.print(bottles.get(type) + ",");
			//break;					// buraya break konulmaz döngü kýracak durumda deðildir.
		   System.out.print("end");
		   
		   
		   }

		
	}
	

