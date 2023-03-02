package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {

	public static void main(String[] args) {
	//output3.txt
	// hello world 를 찍어주세요
	FileOutputStream fos = null;
	// 파일이 없다면 FilerOut... 파일을 먼저 생성해 준다.
	try {
		byte[] bs = new byte[26];
		byte myData = 65;
		fos = new FileOutputStream("output2.txt", true);
		//true라고 적게 되면 추가적으로 글을 쓰는 동작을 하게되고 false라고 쓰면 기존에 있던거를 삭제하고 다시 쓴다.
		// 파일에다가 A ~ Z 까지 알파벳을 출력하고 싶다면 코드 작성 방법은 ??
		//반복 횟수가 정해져 있다면 - for문
		for(int i = 0; i < bs.length; i++) {
			//fos.write(myData);
			bs[i] = myData;
			myData++;
			//65 - A , 66 - B
		}
		fos.write(bs);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}	//end of main
	
}	//end of class
