package in.co.rays.collection;

import java.util.List;
import java.util.ArrayList;


public class Listexample {
	public static void main(String[] args) {
		
	List a1 = new ArrayList();
	a1.add(10);
	a1.add(20);
	System.out.println(a1);
	int element = (int) a1.get(1);
	System.out.println(a1.get(1));
	System.out.println(element);
	
	int element1 = (int) a1.remove(0);
	System.out.println(a1);

}


}