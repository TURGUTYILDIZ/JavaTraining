package HW6_Q50;

import HW6.Q50;
//INSERT CODE HERE 

public class newQ50 {
	
	public void processAccount(int depositSlip, int withdrawalSlip) {
		
		Q50 q50 = new Q50(); //yeni bir nesne oluşturulup başka bir paketteki metodlara erişilebilir.
		
		q50.withdrawal(withdrawalSlip);
		q50.deposit(depositSlip);
		
	}
	
}


