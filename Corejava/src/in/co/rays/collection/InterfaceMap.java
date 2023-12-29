package in.co.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {
	public static void main(String[] args) {
		
	

	Map m = new HashMap();
	
	m.put("suraj", "bhavesh");
	System.out.println(" " + m);
	
	m.put(2, "bhavesh verma");
	System.out.println(m);
	
	m.put(3, "rahul");
	System.out.println(m);
	
	m.put(4, "vijay");
	System.out.println(m);
	
	m.put(5, "suraj");
	System.out.println(m);
	
	
	System.out.println(m.containsKey("suraj"));
	
	System.out.println(m.containsValue("bhavesh"));
	
	System.out.println(m.size());
	
	System.out.println(m.entrySet());
	
	System.out.println("size of map= " +m.size());
	
	System.out.println(m.get(4));
	
	System.out.println(m.isEmpty());
	System.out.println(m.keySet());
	System.out.println(m.put(4, "vijay"));
	System.out.println(m.values());
	System.out.println(m.remove(2));
	System.out.println(m);
	//m.clear();
	//System.out.println(m);
}

}