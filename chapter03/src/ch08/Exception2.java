package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) {

		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return; 
			//심지어 리턴문이 있어도 finally가 실행됩니다.
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			//try 문이 실행되면 반드시 실행 됨.
			System.out.println("여기도 실행되나요?");
		}
	}

}
