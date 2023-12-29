package in.co.rays.Cloning;

public class Accounts1 implements Cloneable {
	
	int balance =0 ;
	public Accounts1 () {
		
	}
	public Accounts1(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
