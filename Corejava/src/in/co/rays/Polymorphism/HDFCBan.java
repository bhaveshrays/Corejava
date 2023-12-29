package in.co.rays.Polymorphism;

public class HDFCBan extends Bankp{
	
	private String name ;
	private double intrestrate;
	
     //  public HDFCBan(double intresrate, String name) {
		
	//	this.intrestrate = intresrate;
	//this.name = name;
	//}
	
	public String getName() {
		return "HDFCBank";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIntrestrate() {
		return 10;
	}

	public void setIntrestrate(double intrestrate) {
		this.intrestrate = intrestrate;
	}	

}
