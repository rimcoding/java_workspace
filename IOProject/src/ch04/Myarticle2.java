package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myarticle2 {

	public static void main(String[] args) {
		//파일 입출력을 활용해서 코드를 작성해 주세요.
		//입력 대상 : article1.txt
		//출력 대상 : today_article.txt

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			// 더이상 읽을게 없다면 -1 을 리턴한다.
			// Reader 기반은 2바이트 이상 처리 가능하다 -> 한글이 깨지지 않아요.
			int i;
			fw.write("MVC 뉴스"+"\n");
			while(( i = fr.read()) != -1) {
				//System.out.print((char)i);
				fw.write(i);
			}
			fw.write("\n"+"작성자 : 홍길동");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
				//사전 기반 지식
				//Writer를 작성할 때 스트림이 열러 있으면 잠시 버퍼 공간에 담아 두었다가
				// 스트림이 종료 되거나 flush 메서드를 만나면 실제로 file에 출력한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}	//end of main

}	//end of class
