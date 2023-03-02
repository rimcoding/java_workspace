package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest3 {

	public static void main(String[] args) {
		//기반스트림과 보조 스트림
		
		long millisecond = 0;
		
		//1
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			//보조 스트림 활용하기 !!
			//보조 스트림을 이용해서 읽어내면 걸리는 소요시간이 더 줄어든다.
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			int i;
			millisecond = System.currentTimeMillis(); 	// 10
			while((i= bis.read()) != -1) {
				bos.write(i);
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
