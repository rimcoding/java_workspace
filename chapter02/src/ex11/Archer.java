package ex11;

public class Archer extends Hero{
	public Archer(String name, int hp) {
		// 부모 클래스에 사용자 정의 생성자가 있다면 
		// 부모 생성자를 반드시 호출 하여야 한다.
		//System.out.println("111111"); //부모 정의 생성자가 있으면 먼저 호출 해 주어야 한다.
		super(name,hp); // super 키워드는 부모 생성자를 호출 하는 녀석이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	void fireArror() {
		System.out.println(super.name + "가 불화살 공격 합니다.");
	}
}


