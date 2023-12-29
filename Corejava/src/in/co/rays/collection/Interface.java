package in.co.rays.collection;

	import java.util.ArrayList;
	import java.util.Collection;



public class Interface {
public static void main(String[] args) {
			Collection c1 = new ArrayList();
			c1.add(10);
			//System.out.println(c1);
			c1.add("two");
			c1.add("three");
			c1.add("bhavesh");
			c1.add("100");
		//	System.out.println("c1=" + c1);
			
			Collection c2 = new ArrayList();
			
			c2.add("rohit");
			c2.add("suraj");
			c2.add("bhavesh");
			c2.add("sanjana");
			//System.out.println("c2=" +c2);
			
			c1.add(c2);
			//System.out.println("c1 after adding c1 =" +c1);
			
			//System.out.println (c1.contains(100));
		//	System.out.println(c1);
			//System.out.println("c1 after containing c2="+c1);
		//	System.out.println("c1 after containsall c2= "+c1.containsAll(c2));
//			c1.clear();
//			System.out.println(c1);
			System.out.println(c1.isEmpty());
			c1.size();
			System.out.println(c1);
			
          
}

	}

