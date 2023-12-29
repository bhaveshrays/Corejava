package in.co.rays.overriding;

public class Testshape {
	
	public static void main(String[] args) {
		
		Shape1 s = new Shape1 ();
		s.area();
		
		Rectangle r = new Rectangle();
		r.area();
		
		Shape1 s1 = new Rectangle();
		s1.area();
				
		
	}

}
