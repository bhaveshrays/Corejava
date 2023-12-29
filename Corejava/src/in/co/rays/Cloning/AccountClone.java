package in.co.rays.Cloning;

public class AccountClone implements Cloneable {
	
	String name = "bhavesh";
	int balance = 22;
	public AccountClone () {
		
		
	}
	
	public AccountClone(int balance) {
		this.balance= balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
