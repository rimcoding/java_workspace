package ch02;

public class ToyRobot implements RemoteController{

		//자동완성으로 만들면 잘못된 설계이다.
		
		String name;

		@Override
		public void turnOn() {
			System.out.println("장난감 로봇을 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("장난감 로봇을 끕니다.");
		}

		@Override
		public void SoundOn() {
			System.out.println("띠리리리링~~~");
		}
		
		
}
