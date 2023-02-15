package ex1;

public class Bus {

	int busNumber;
	int passengercount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		passengercount++;
	}
	public void showBusInfo() {
		System.out.println(busNumber +"번 버스를 타겠습니다.");
	}
}
