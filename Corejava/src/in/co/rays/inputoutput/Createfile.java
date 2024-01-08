package in.co.rays.inputoutput;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main (String []args) throws IOException {
		
		
		File f = new File ("C:\\Users\\Bhavesh\\Desktop\\core java\\image\\hello2");
		
	if (f.createNewFile()) {

		System.out.println("file created");
	}
	else {
		System.out.println("already exists");
	}
	}
	
}
