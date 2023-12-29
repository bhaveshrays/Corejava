package in.co.rays.constructor;

public class TestShape {
	
	public static void main(String[] args) {
		
//		Shape s = new Shape();
		Shape s = new Shape ("blue", 22);
		
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}

}
