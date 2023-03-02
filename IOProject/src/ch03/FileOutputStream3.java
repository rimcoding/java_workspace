package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

public class FileOutputStream3 {

	public static void main(String[] args) {
		
	FileOutputStream fos = null;
	//output3.txt 파일에다가
	//hello world 를 찍어주세요.
		try {
			fos = new FileOutputStream("output3.txt");
			fos.write(104);
			fos.write(101);
			fos.write(108);
			fos.write(108);
			fos.write(111);
			fos.write(119);
			fos.write(111);
			fos.write(114);
			fos.write(108);
			fos.write(100);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
		
	}	//end of main
	
}	//end of class
