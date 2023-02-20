package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		//현재 잔액 10만원
		BankAccount bankAccount = new BankAccount(); 

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		//아버지 입급하기
		father.start(); //3초 걸림
		//어머니 출금하기
		mother.start();
		//정상 처리 : 10 + 1만원 입금 - 5천원 = 10만 5천원
		//먼저 락을 걸어주고 작업을 진행하고 그뒤에 작업하는거
		
	}

}
