package in.co.rays.Cloning;

public class Testcustomer  {
	public static void main (String []args) throws CloneNotSupportedException{
		
		Customer c1 = new Customer ("bhavesh", 1000);
		Customer c2 = (Customer) c1.clone();
		
		c2.name ="verma";
		c2.acc.balance=22;
		
		System.out.println("c1 name="+c1.name);
		System.out.println("c1 bal ="+ c1.acc.balance);
		System.out.println("c2 name ="+c2.name);
		System.out.println("c2 bal="+c2.acc.balance);
	}

}
