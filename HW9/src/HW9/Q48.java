package HW9;

import java.util.ArrayList;
import java.util.List;

public class Q48 {
	
	public static void main() {
		
		List<String> magazines = new ArrayList();
		magazines.add("Readers Digest");
		magazines.add("People");
		magazines.clear(); // dizi sýfýrlanýyor.
		magazines.add("The Economist");
		magazines.remove(1); // 2. elemaný sil iþlemni yapýlýyor. fakat 1 eleman var hata verir.
		System.out.println(magazines.size());
		
	}

}
