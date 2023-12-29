package in.co.rays.Cloning;

public class Accounts  implements Cloneable{
	int balance =0;
	
	public Accounts(){
		
	}
	
	public Accounts(int balance) {
		this.balance =balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

	

}