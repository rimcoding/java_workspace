package ch02;

public class Refrigerator extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다");
	}

	@Override
	public void SoundOn() {
		System.out.println("띠리리리링");
	}


}
