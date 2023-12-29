package in.co.rays.Cloning;

public class TestClone {
	public static void main (String []args) throws CloneNotSupportedException{
		
		AccountClone a1= new AccountClone(20);
		AccountClone a2 =(AccountClone)a1.clone();
		
		a2.name= "verma";
		a2.balance =20;
		
		System.out.println("name ="+a1.name);
		System.out.println("balance="+a1.balance);
		System.out.println("name="+ a2.name);
		System.out.println("balance="+a2.balance);
	}

}
