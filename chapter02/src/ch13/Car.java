package ch13;

//템플릿 메서드 패턴을 구현
//핵심 run()메서드이다.
public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
		//후크 메서드
	public void washCar() {
		//아무것도 구현하지 않음 -> 일반 메서드이다.
	}
	//실행에 흐름을 만들어 둔다.
	//재정의 할 수 없게 설계한다. - final (메서드 앞)
	//하위 클래스에서 재정의 할 수 없음
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
