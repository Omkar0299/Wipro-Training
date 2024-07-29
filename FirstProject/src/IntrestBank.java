
public class IntrestBank {

	public static void main(String[] str) {
		Bank bank = new ICICIBank();
		 System.out.println("ICICI Bank intrest:"+ bank.bankIntrestRate());
		 Bank bank2 = new SBIClass();
		 System.out.println("SBI Bank intrest:"+ bank2.bankIntrestRate());
		}
	
}
