package ch12;

//public abstract class Human extends Animal { 1번 해결방안
	public class Human extends Animal {
		//기본적으로 추상 클래스는 new 항 수있다.
		// 부모 클래스에 있는 추상 메서드를 자식 클래스에서
		//일반 메서드로 재정의 하였다.
		@Override
		public void hunt() {
			// TODO Auto-generated method stub
			System.out.println("휴먼이 사냥을 합니다.");
		}

	// 1.추상 메시드를 포함하게 되면 추상 클래스로 만들어 주면 된다.
	
}
