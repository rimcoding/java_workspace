package ch05;

public interface IUserInfoDao {
	//책 전체 삭제를 생각해보면 된다.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(String userName);
	void selecteUserInfo(String userName);
}
