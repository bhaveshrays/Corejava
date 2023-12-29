package in.co.rays.exception;

public class TestPropagation extends Mistake {
	public static void main(String[] args) throws Mistake {
		dad();
		
	}
public static void dad() throws Mistake{
mom();

}
public static void mom() throws Mistake{
	son();
	}

public  static void son() throws Mistake{
	 try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
