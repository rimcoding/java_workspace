package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null; 	//받아주는과정에 변경하게 해줌
		//return;	//여기에서 종료가 되기 때문에 쓸 필요가 없다고 예외로 빨간밑줄이 생김
//		try {
//			fis = new FileInputStream("temp"); // <- 예외 발생 가능 코드
//		}catch(FileNotFoundException f) {
//			System.out.println("temp 라는 파일이 없습니다.");
//		}
		
		//try-catch-finally
		
		try {
			fis = new FileInputStream("test1.txt");
			return;	//파일명이 다르면 이쪽부분은 수행이 안된다.
		} catch (FileNotFoundException e) {
			//e.printStackTrace();		//예외를 좀더 자세하게 찍어줌
			System.out.println("파일명 확인해주세요");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//심지어 리턴 키워드를 만나더라도 수행이 된다. 아주 강력한 녀석
			//반드시 수행되는 코드이다.
			System.out.println("finally 수행!!");
		}
		System.out.println("비정상 종료 되지 않았어요!");
	}	//end of main

}	//end of class
