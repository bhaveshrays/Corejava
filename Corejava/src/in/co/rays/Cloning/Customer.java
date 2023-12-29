package in.co.rays.Cloning;

public class Customer implements Cloneable{
	String name = null;
	Accounts acc = new Accounts();
	
	public Customer (String name,int bal ) {
this.name = name;
this.acc.balance= bal;

}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.acc= (Accounts)acc.clone();
		// TODO Auto-generated method stub
	//	return super.clone();
		return c;
	}
}