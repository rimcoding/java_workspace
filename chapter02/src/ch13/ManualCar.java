package ch13;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟습니다.");
	}


	
	
}	//end of class
