package ch08;

public class MainTest2 {

	public static void main(String[] args) {
	
		// 클래스 안에 멤버 변수를 사용할려면
		// 반드시 먼저 메모리에 올려야 한다.
		
		//수행 요청 - 클래스이름
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		
		//static 개념이 어려우면 태양을 떠올리면 됨
		//먼저 존재하고 있고 class개념으로 먼저 접근해서 값이 나오고 다 같이 공유하고 있다.
		
		
		//static 문법적으로 class xxx {}안에 작성을 하지만 static 키워드를 가진 녀석은
		//잠시 자리만 빌려서 문법만 사용할 뿐 메모를 사용하는 영역은 미리 뜨는 static 영역이다.
		
		System.out.println(NumberPrinter.waitNumber);
	}

}
