package in.co.rays.Polymorphism;

public class Circle extends Shape{
	
	private int radius;
	private  double pi = 3.14;
	
	public Circle () {
		System.out.println("default circle cons");
	} 
	public Circle(int radius) {
		this.radius =radius;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void  area () {
		double area = pi* radius * radius;
		System.out.println("circle area =" +area);
	}

}
