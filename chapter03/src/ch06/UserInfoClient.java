package ch06;

import java.util.Scanner;

public class UserInfoClient {
	
		static String dbName = "MSSQL";
		// main --> 실행하는 코드 작성 (사용쪽 코드)
	public static void main(String[] args) {
		
		
		//UserINfoOracleDao 만들어주세요.
		//스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		sc.nextInt();
		//흐름 만들기
		//1.저장기능 2.수정기능
		//dbName 변경해 가면서 코드 동작 확인해 주세요.
		
		// 사용자 한테 정보를 입력 받는다.
		//String userName, String pw
		//스캐너 활용 -> 이름을 방어적 코드로 짤수있다(이름 한글자 이상,pw 특수 포함)
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		//위에 받은 데이터를 Object 타입 변화 -> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMsSqlDao();
		}else {
			dao = new UserInfoMysqlDao();
		}
		

	}	
}
