package in.co.rays.Cloning;

public class TestAccountsclone {

	public static void main (String []args)throws CloneNotSupportedException{
		
		AccountClone a1= new AccountClone(20);
		AccountClone a2 =(AccountClone)a1.clone();
		a2.balance =222;
		a2.name = "bhavesh";
		System.out.println(a2.balance);
		System.out.println(a2.name);
	}
}
