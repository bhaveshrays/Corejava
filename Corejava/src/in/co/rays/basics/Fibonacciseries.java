package in.co.rays.basics;



public class Fibonacciseries {
	public static void main (String []args) {
		
		int a=1;
		int b= 3;
		System.out.print(a+","+b);
	
for (int i = 0; i <= 5; i++) {
	int z=a+b;
	a=b;
	b=z;
	System.out.print(","+z);
	
	
}
	}

}
