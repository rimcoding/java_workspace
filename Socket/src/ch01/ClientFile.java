package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 측 코드
//소켓 통신을 할려면 소켓이 필요하다. (서버측 연결을 담당하는 포트 번호를 알아야 한다)
public class ClientFile {
	final String IP = "192.168.0.130";
	//final String IP = "localhost";
	
	Socket socket;
	
	public ClientFile() {
		try {
			System.out.println("클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP,11000);
			System.out.println("소켓 으로 연결 완료");
			
			// 키보드에서 데이터 입력 - 표준 입출력은 키보드 (System.in)
			// 키보드 연결 스트림 생성
			InputStreamReader reader = new InputStreamReader(System.in);
			// 확장 - 보조 스트림 추가
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("키보드 입력 대기 : ");
			String keyboatdMsg = bufferedReader.readLine(); 	//엔터키 칠때까지 읽어준다.
			
			//데이터를 보내야해 !! -> 출력 스트림을 사용해서 데이터를 흘려 보낼 수 있다.
			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			//확장 + 보조 스트림
			BufferedWriter bufferedWriter = new BufferedWriter(osw);
			bufferedWriter.write("keyboardMsg : " + keyboatdMsg + "\n");
			//중요 . ! 메세지에 끝을 알려 주어야 한다.
			bufferedWriter.flush();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClientFile();
	}	//end of main
}
