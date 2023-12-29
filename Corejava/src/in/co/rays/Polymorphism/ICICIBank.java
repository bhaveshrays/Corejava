package in.co.rays.Polymorphism;

public class ICICIBank extends Bankp {
	
	private String name ;
	private double intrestrate;
	
	// public ICICIBank(double intresrate, String name) {
		
	//this.intrestrate = intresrate;
	//	this.name = name;
	//}
	
	public String getName() {
		return "ICICIBank";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIntrestrate() {
		return 25;
	}

	public void setIntrestrate(double intrestrate) {
		this.intrestrate = intrestrate;
	}	

}

