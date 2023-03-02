package ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {

	long millisecond = 0;
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("maple_story.zip");
		fos = new FileOutputStream("maple_storycopy.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int i;
		millisecond = System.currentTimeMillis();
		while((i= bis.read()) != -1) {
			bos.write(i);
		}
		millisecond = System.currentTimeMillis() - millisecond;
		System.out.println("소요시간 : " + millisecond);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
	}	//end of main

}	//end of class
