package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		//문자 단위로 읽어 들이는 스트림
		//Reader는 최소 2바이트를 읽어서 한글이 안 깨지게끔 읽어준다.
		FileReader fr = null;
		try {
			fr = new FileReader("output2.txt");
			// - 1
			int i;
			while( ( i = fr.read()) != -1 ) {
				System.out.println((char)i);
			}
			int temp = fr.read();
			System.out.println("temp : " + (char)temp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	//end of main

}	//end of class
