package ch02;


	public interface RemoteController {
		//모든 변수는 ---> public static final
		//모든 메서드 ---> 추상 메서드 !!!
		
		//인터페이스란?
		//구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
		
		//특성
		//멤버 변수, 일반 구현 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 멤버로 가질 수 있다.
		// 인터페이스는 표준, 약속(강제성 있는 규칙)
		//리모컨을 예로 들어서 생각하면 인터페이스 개념을 잡기 쉽다.
		
		//추상클래스보다 추상화가 더 높다.
		//자바가 처음부터 상속,추상화,인터페이스가 생긴게 아니고 필요에 따라 하나씩 생긴거라
		//둘다 개념을 알면 편하다. 나중에 남이 작성한 코드를 이해하고 수정하기  용이하게
		
		public static final int SERIAL_NUMBER = 100;	//상수만 가질 수 있다.
		public abstract void turnOn();
		//public abstract void turnOff();
		
		void turnOff();		//추상 메서드라는걸 인지한다.

		void SoundOn();
	}

