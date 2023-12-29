package in.co.rays.Polymorphism;

public class Shape {
	private int borderwidth;
	private String color;
	
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	
	public int getBorderwidth() {
		return borderwidth;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Shape() {
		System.out.println("Default shape");
	}
	public void area () {
		System.out.println("shape area");
	}
}
