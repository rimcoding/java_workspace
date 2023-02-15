package ch08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyException {

	public static void main(String[] args) {
		
		TxtFileInputManager inputManager 
		= new TxtFileInputManager("test.txt");
		
		try {
			
		String result = 	inputManager.readTxtfileDate();
		System.out.println("result : " + result);
		} catch (IOException e) { //Exception이랑 바꿔도 똑같다.
			e.printStackTrace();
		}
	} //end of main
}	//end of class

class TxtFileInputManager{
	
	// 외부 파일을 내 메모리 상으로 가져올 수 있는 녀석
	private FileInputStream fis;
	private String fileName; //한글로 하면 한글이 깨지고 영어는 안깨짐
	
	public TxtFileInputManager(String fileName) {
		this.fileName = fileName;
	}
	
	public String readTxtfileDate() throws IOException {
		//IOException 부모
		//FileNotFoundException
		fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		// KEY = VALUE <- 데이터를 읽어주는 녀석
		// name = 홍길동 -> 홍길동 -> 추출
		String name = prop.getProperty("name");
		return name;
	}
}

	class MyABEception extends IOException{
		//사용자 정의 예외 클래스도 만들 수 있다.
	}
