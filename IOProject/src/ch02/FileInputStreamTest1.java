package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		 
		FileInputStream fis = null;
		
		try {
			//오류가 안나면 우리코드가 스트림이 연결 되었다는 뜻	
			fis = new FileInputStream("input.txt");
			//int temp = fis.read();
			//System.out.println(temp);
			//System.out.println((char)temp);
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			//IOException = FileNotFoundException보다 상위 클래스 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//비정상 처리 했기 때문에 코드가 옴
		System.out.println("여기 코드가 올까요?");
		
	} //end of main

}	//end of class
