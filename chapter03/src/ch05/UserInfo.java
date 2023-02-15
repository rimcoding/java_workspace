package ch05;

// DTO : Data Transfer Object
//뭉쳐서 쓰는게 좋다.

public class UserInfo {
	public static int SERIAL_NUMBER = 0;
	private int Id;
	private String userName;
	private String pw;

	public UserInfo(String userName, String pw) {
		SERIAL_NUMBER++;
		this.Id = SERIAL_NUMBER;
		this.userName = userName;
		this.pw = pw;
	}

	public int getId() {
		return Id;
	}

	public String getuserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	public void showInfo() {
		System.out.println("사용자 정보 확인");
		System.out.println("userName : " + userName);
		System.out.println("pw : " + pw);
	}
}
