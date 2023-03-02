package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myarticle {

	public static void main(String[] args) {
		//파일 입출력을 활용해서 코드를 작성해 주세요.
		//입력 대상 : article1.txt
		//출력 대상 : today_article.txt

		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");					
			int i;
			fw.write("MVC뉴스"+"\n");
			while( ( i= fr.read()) != -1 ) {
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}	//end of main

}	//end of class
