package in.co.rays.Polymorphism;



public class Testhomeloan {
	public static void main (String[] args) {
		Bankp[] b = new Bankp[3];
		b[0] =new AxisBank();
		b[1] = new HDFCBan();
		b [2] =new ICICIBank();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].getName() +"="+b[i].getIntrestrate());
			
		}				
		
	}

}
