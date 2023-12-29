package in.co.rays.Polymorphism;

public class Triangle extends Shape  {
	
private int height;
private int base;

public Triangle() {
	System.out.println("Default Trianlge");
}
public Triangle (int height, int base) {
this.base =base;
this.height = height;
}

public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}

public void area () {
	double area =(height*base)/2;
	System.out.println("Triangle  area "+ area);
}


}
