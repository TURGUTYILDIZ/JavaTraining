package HW8;

import java.io.*;
public class Q49 {
	public void performBackup() {
		try {
			throw new IOException("Disk not found");
			}
		catch (Exception e) {
			try {
				throw new FileNotFoundException("File not found");
				}
			catch (FileNotFoundException e2) {  // z1   ayný isimden 2 nesne oluþturulmasý izin verilmemektedr.
				System.out.print("Failed");
				}
			}
		}
	public static void main(String... files) {
		new Q49().performBackup();  // z2
		
		}
}
