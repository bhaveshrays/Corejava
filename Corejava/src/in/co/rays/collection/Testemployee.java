package in.co.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class Testemployee {

	
	public static void main(String[] args) {
		
		Employee e1= new Employee (1, "bhavesh", 1000);
		Employee e2 = new Employee(2, "suraj", 20000);
		Employee e3 = new Employee(3, "rohit", 30000);
		Employee e4 = e1;
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e4.hashCode());
		
		
		
		
		
		List list = new ArrayList();
		list.add(e1);
		
	}
}
