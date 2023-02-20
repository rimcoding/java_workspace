package ch02;

// sharedResource 상황을 구현해 보자.
public class BankAccount {
	
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 출금,입금 기능
	//synchronized <--동기화 처리진행
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금후 계좌 잔액"+ getMoney());
	}
	
	public synchronized int widthDraw(int money){
		// 10만원 상태
		
		int currentMoney = getMoney();
		try {
			//10만원 -> 어머니가 먼저실행 95000 -> 아버지가 진행중 11만원
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금후 계좌 잔액 : " + getMoney());
			return money;
		}else {
			System.out.println("계좌 잔액이 부족합니다.");
			return 0;
		}
	}
	
}

class Father extends Thread{
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		//입금
		account.saveMoney(10_000);
	}
	
}
class Mother extends Thread{
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.widthDraw(5_000);
	}
	
	
}
