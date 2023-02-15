package ch04;

public class UserInfoClient {
	
	// main --> 실행하는 코드 작성 (사용쪽 코드)
	public static void main(String[] args) {
		
		// 사용자 한테 정보를 입력 받는다.
		//String userName, String pw
		//스캐너 활용 -> 이름을 방어적 코드로 짤수있다(이름 한글자 이상,pw 특수 포함)
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		//위에 받은 데이터를 Object 타입 변화 -> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
	//	userInfo.showInfo();
		
		//위에는 클라이언트 쪽 코드들 (개발자 작성)
		//////////////////////////////////////
		//동작이 사용자에 정보를 입력하는 기능이 필요하다면
		//필요한 객체를 가져와서 사용하기만 하면 됩니다.
	UserInfoMysqlDao dao = new UserInfoMysqlDao();
		
		//인터페이스를 보면 다음 개발자가 이렇게 작업을 하겠구나 알수있는 명세다.
		dao.insertUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
	
//		dao.insertUserInfo(userInfo); 		//저장하는기능
//		dao.updateUserInfo(userInfo); 	//수정하는기능
//		dao.deleteUserInfo(userInfo.getuserName());  	//삭제기능
//		dao.selecteUserInfo(userInfo.getuserName());

	}	
}
