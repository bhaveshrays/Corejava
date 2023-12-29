package in.co.rays.exception;

public class Testclassaccount {
	public static void main(String[] args) throws InsufficientBalance{
Accounts a = new Accounts();
a.deposite(4000);
//a.withdrawl(1500);
try {
	a.withdrawl(4500);
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
