package in.co.rays.collection;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String [] args) {
		
		String Operator = null;
		double result =0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter value of a ");
		
		double a = sc.nextDouble();
		System.out.println("Enter value of b");
		
		Double b = sc.nextDouble();
		
		System.out.println("Operator =");
		Operator = sc.next();
		
		switch (Operator) {
		
		case "+" :
		result = a+b;
		System.out.println(result);
		break;
		
		case "-":
			result = a-b;
			System.out.println(result);
			break;
			
		case "*":
			result = a*b;
			System.out.println(result);
			break;
			
		case "/":
			result = a/b;
			System.out.println(result);
			break;
			
			
			default:
			System.out.println("Operator error");
			break;
		
		}
		
		
	}

}

