package in.co.rays.Cloning;

public class TestAccounts {

	
	public static void main (String[] args ) throws CloneNotSupportedException {
	Accounts a1 = new Accounts(10);
	
	Accounts a2 =  (Accounts)a1.clone();
	a2.balance = 200;
	System.out.println (a2.balance);
	
	
}
}
