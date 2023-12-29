package in.co.rays.Cloning;

public class Accounttest1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		

	Accounts1 a1 = new Accounts1(10); 
	Accounts1 a2 =(Accounts1)a1.clone();
	a2.balance =200;
	
System.out.println (a2.balance);
	}
}
