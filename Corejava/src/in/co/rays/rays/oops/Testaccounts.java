package in.co.rays.rays.oops;

public class Testaccounts {
	public static void main(String[] args) {
		
	
    SavingAccounts s = new SavingAccounts();
    Accountinheritance a = new Accountinheritance();
    Accountinheritance as = new SavingAccounts();
    a.setDeposite(60);
    as.setId(1);
    as.setDeposite(30);
    
    System.out.println(s.getamount());
    System.out.println(a.getDeposite());
    System.out.println(as.getId());
    System.out.println(as.getDeposite());
    
    
    		
	} 

		
	}
	


