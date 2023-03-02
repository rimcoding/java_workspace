package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		//키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 Enter를 누르세요.");
		
		int i;
		// 한 바이트씩 키보드에 값을 입력받아 읽어라
		try {
			//입력
			i = System.in.read();
			//출력
			System.out.println(i);
			// 인코딩 - 컴퓨터에는 문자를 쓰기위해서 문자표가 미리 저장된게 있음(미리 약속) -> 정수값을 문자열로 변환하는것
			System.out.println((char)i);
			//ab를 입력할때 a만 출력한다 - 기반 스트림
			//한글을 입력하니까 문자가 깨짐 (영어는 1byte안에 표현이 다되지만 한글이나 다른 언어로 표현할려면 byte를 늘려야한다)
			//그러므로 유니코드로 재정의하여 문자를 연출한다. (utf-8, utf_16)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	//end of main

}	//end of class
