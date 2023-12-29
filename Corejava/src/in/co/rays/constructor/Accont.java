package in.co.rays.constructor;

public class Accont {
	
	private String Accounts;
	private int Balance;
	public Accont() {
		
		System.out.println("default constrctor");
	}

	public Accont(int Balance , String Accounts)
	{
		
		this.Accounts = Accounts;
		this.Balance = Balance;
	}
	
	public String getAccounts() {
		return Accounts;
	}
	
	
	public int getBalance () {
		return Balance;
	}
}
