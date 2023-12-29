package in.co.rays.exception;

import javax.security.auth.login.LoginException;

public class Testclass {
	public static void main(String[] args) {
		String  s ="user";
		if (s.equals ("user")){
			System.out.println("valid");
		}
		else {
			try {
throw new LoginException();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("not valide");
			}
		}

	}

}
