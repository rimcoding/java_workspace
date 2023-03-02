package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {

		//문자 단위로 읽어 들이는 스트림
		FileReader fr = null;
		try {
			fr = new FileReader("output2.txt");
			int temp = fr.read();
			//Reader는 최소 2바이트를 읽어서 한글이 안깨지게끔 해준다.
			System.out.println("temp : " + (char)temp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	//end of main

}	//end of class
