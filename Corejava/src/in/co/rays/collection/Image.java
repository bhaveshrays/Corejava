package in.co.rays.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
	public static  void main (String []args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\Bhavesh\\Desktop\\core java\\image\\test.png");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Bhavesh\\Desktop\\core java\\image\\logo.png");
		
		int i = fi.read();
		while (i != -1) {
			
			 fo.write(i);
			i =fi.read();
			
		}
		
		fi.close();
		fo.close();
	
	
	}

}
