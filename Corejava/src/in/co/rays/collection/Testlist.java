package in.co.rays.collection;


	import java.util.ArrayList;
	import java.util.List;

	public class Testlist {
		
		public static void main (String[]args) {
			
			
			List l1 = new ArrayList();
			l1.add("one");
			System.out.println(l1);
			
			l1.add("sanju");
			System.out.println(l1);
			
			l1.add("bhavesh");
			System.out.println(l1);
			
			l1.add("rishendra - late comer");
			System.out.println(l1);
			
			l1.add("rohit");
			System.out.println("\n" +l1);
			
			
			System.out.println("\n"+"index 4 element- " + l1.get(4));
			System.out.println("\n"+"index 3 element- " +  l1.get(3));
			System.out.println("\n" +"remove index 1st element- " + l1.remove(1));
			System.out.println("\n" + "after removing index 1st element- "+ l1);
			System.out.println("\n"+ "removie index 3rd element- "+ l1.remove(3));
			System.out.println("\n" +"after removing index 3rd element- "+ l1);
			
			
			l1.set(0, "rahul");
			System.out.println("\n"+"l1 after set command- "+ l1);
			//System.out.println("\n" +"after command- "+ l1);
			System.out.println("\n" + "l1 index of bhavesh = " + l1.indexOf("bhavesh"));
			l1.add("sush");
			l1.add("rahul");
			l1.add("suraj");
			l1.add("rays");
			
			System.out.println("\n"+  "after adding new element =" +l1);
			
			System.out.println("\n" + "last index of rahul " +  l1.lastIndexOf("rahul"));
			
			System.out.println("\n" + "last index of bhavesh " + l1.lastIndexOf("bhavesh"));
			System.out.println("\n"+  "after adding new element =" +l1);
			System.out.println("\n" + "l1.subList(4.6)= " + l1.subList(4, 6));
			System.out.println("\n" + "sublist (2,6)=" +l1.subList(2, 6));
			
			
			
			
		}

	}

	