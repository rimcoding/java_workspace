package ch05;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {
		//기반스트림과 보조 스트림
		
		long millisecond = 0;
		
		//1
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			int i;
			millisecond = System.currentTimeMillis(); 	// 10
			while((i = fis.read()) != -1) {
				// i 라는 공간안에 읽고 있는중
				fos.write(i); 	//쓰는 중
			}
			// 20이 걸렸다고 하면 20 - 10 = 걸린시간을 알수 있다.
			millisecond = System.currentTimeMillis() - millisecond;
			System.out.println("파일 복사시 소요시간 : "+millisecond);
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
