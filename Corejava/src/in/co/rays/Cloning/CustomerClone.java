package in.co.rays.Cloning;

public class CustomerClone {

	String name = null;
    AccountClone Acc = new AccountClone();
    public CustomerClone(String name, int balance) {
    	this.name = name;
    	this.Acc.balance= balance;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
    
}
