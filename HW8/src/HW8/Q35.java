package HW8;

public class Q35 {
	
	public String getAddress(String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
			}
		finally {
			System.out.print("Posted:");
			}
		}

	public static void main(String[] form) {
				String street = "b";
				String city = "a";
				System.out.print(new Q35().getAddress(street,city));
				
				//çýktý olarak   Posted:b : a  saðlanýr.
				
		}

	}


