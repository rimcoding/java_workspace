package ch10;

public class CalTest {
	//코드 테스트
		public static void main(String[] args) {
			Cal2 cal2 = new Cal2();
			//cal2에 multiply 메서드가 있는지 확인
			//cal2에 multiply 없다면 부모 클래스에 있는 메서드를 확인한다.
			//부모에 메서드 multiply 재 정의 한다면 --> 오버 라이드라고 한다.
			//System.out.println(cal2.multiply(100, 100));
			System.out.println(cal2.multiply(0, 100));
		}
}
