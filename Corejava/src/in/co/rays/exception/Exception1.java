package in.co.rays.exception;

public class Exception1 {
	public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	//int c =a/b;
	String s =null;
	try {
		System.out.println(s.length());
		int c =a/b;
		System.out.println(c);
		
		}
	catch (NullPointerException n) {
		// TODO: handle exception
		System.out.println(n);
	}
	 catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println();
	}
	
	}
}
