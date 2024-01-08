package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Testemp {

	public static void main(String[] args) {
		
		Emp e1= new Emp (1, "bhavesh",10000);
		Emp e2 = new Emp(2, "suraj", 20000);
		Emp e3 = new Emp(3, "rohit", 30000);
		Emp e4 = new Emp(4, "rahul", 40000);
		
		List list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			
			
			Object object =(Object) it.next();
			Emp e = (Emp) object;
			System.out.println(e);
		}
		
		
		
		
	}
	
}
