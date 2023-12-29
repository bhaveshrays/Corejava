package in.co.rays.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee (1, "bhavesh", 45000);
		
		Employee e2 =new Employee(2, "suraj", 500000);
		
		Employee e3 = new Employee (3, "rohit" , 555555);
		
		Employee e4 =new Employee(4, "sanjana", 600000);
		
		List list =new ArrayList();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
		Iterator it =list.iterator();
		while (it.hasNext()) {
			
			Object object = it.next();
			
		Employee e = (Employee) object;
		
		//System.out.println(e);
		
		System.out.print(e.getId());
		System.out.print("\t " +e.getSalary());
		System.out.println("\t "+e.getName());
		}
		
	} 

}
