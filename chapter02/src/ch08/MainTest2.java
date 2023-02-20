package ch08;

public class MainTest2 {

	public static void main(String[] args) {
	
		// 클래스 안에 멤버 변수를 사용할려면
		// 반드시 먼저 메모리에 올려야 한다.
		
		//수행 요청 - 클래스이름
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter2.waitNumber);

		NumberPrinter2 numberPrinter2 = new NumberPrinter2(1);
		System.out.println(numberPrinter2.waitNumber);
		System.out.println("==================");
		
		System.out.println(NumberPrinter2.getWaitNumber());
		System.out.println(numberPrinter2.getWaitNumber());
		
		//static 개념이 어려우면 태양을 떠올리면 됨
		//먼저 존재하고 있고 class개념으로 먼저 접근해서 값이 나오고 다 같이 공유하고 있다.
		
	}

}
